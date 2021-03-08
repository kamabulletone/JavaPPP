package ru.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.model.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class ShedulerService {
    private static String itemFIle = "D:\\JavaPPPrepos\\practice_22\\item.txt";
    private static String orderFile = "D:\\JavaPPPrepos\\practice_22\\order.txt";

    @Autowired
    private ItemService ir;

    @Autowired
    private OrderService or;


    @Scheduled(cron = "20 * * * * *")
    public void updateItemFile() {
        File i = new File(itemFIle);
//        if(i.exists() && !i.isDirectory()) {
//
//        }

          if(i.exists() && !i.isDirectory()) {
               i.delete();
          }
          else {
              try {
                  BufferedWriter writer = new BufferedWriter(new FileWriter(itemFIle));
                  
                  writer.write(ir.getItems());

              } catch (IOException e) {
                  e.printStackTrace();
              }
          }

        System.out.println("20 sec have passed");
    }

    @Scheduled(cron = "15 * * * * *")
    public void updateOrderFile() {
        System.out.println("15 sec have passed");
    }

}

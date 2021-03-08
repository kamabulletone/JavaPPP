package com.ru.pr14.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BruhController {

   @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getPage() {
       return "index.html";
   }
}

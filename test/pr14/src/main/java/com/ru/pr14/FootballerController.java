package com.ru.pr14;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FootballerController {

    List<Footballer> footballers = null;

    @RequestMapping(value = "/home/createTeam", method = RequestMethod.POST)
    public void createFootballer(@RequestBody Footballer footballer) {
        System.out.println("I'm in");
        if (footballers == null) {
            footballers = new ArrayList<Footballer>();
        }
        footballers.add(footballer);
        System.out.println(footballers.toString());

    }

    @RequestMapping(value = "/home/delFootballerByName", method = RequestMethod.POST)
    public void delFootballerByName(@RequestBody Footballer footballer) {

        if (footballers.contains(footballer)) {
            footballers.remove(footballer);
        }
        else {
            System.out.println("No footbalelr");
        }

    }

    @RequestMapping(value = "/home/delFootballer", method = RequestMethod.GET)
    public void delFootballer() {
        footballers = new ArrayList<Footballer>();
        System.out.println(footballers.toString());
    }

    @ResponseBody
    @RequestMapping(value = "/home/getFootballers", method = RequestMethod.GET)
    public List<Footballer> getFootballer() {
        return footballers;
    }
}

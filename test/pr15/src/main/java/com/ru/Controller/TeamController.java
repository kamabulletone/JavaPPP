package com.ru.Controller;


import com.ru.Model.Team;
import com.ru.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TeamController {

    @Autowired
    TeamService teamService;

    List<Team> teams = null;

    @ResponseBody
    @RequestMapping(value = "/home/createteam", method = RequestMethod.POST)
    public void createTeam(@RequestBody Team team) {
//        System.out.println("I'm in");
//        if (teams == null) {
//            teams = new ArrayList<Team>();
//        }
//        teams.add(team);
        teamService.addTeam(team);

        System.out.println(teams.toString());

    }

    @RequestMapping(value = "/home/delTeamByName", method = RequestMethod.GET)
    public void delTeamByName(@RequestParam(name="name") String name) {
        for (Team t : teams) {
            if (t.getName().equals(name)) {
                teams.remove(t);
                System.out.println("i've deleted");
                System.out.println(teams.toString());
                break;
            }
        }

    }

    @RequestMapping(value = "/home/delTeam", method = RequestMethod.GET)
    public void delTeam() {
        teams = new ArrayList<Team>();
        System.out.println(teams.toString());
    }

    @ResponseBody
    @RequestMapping(value = "/home/getTeams", method = RequestMethod.GET)
    public List<Team> getTeams() {
        return teams;
    }
}

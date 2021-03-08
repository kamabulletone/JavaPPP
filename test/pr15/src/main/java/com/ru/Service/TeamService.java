package com.ru.Service;


import com.ru.Model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
public class TeamService {
    @Autowired
    SessionFactory sessionFactory;

    Session session;

    public void addTeam(Team team) {
        session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(team);

        session.getTransaction().commit();
        session.close();

    }

    @PreDestroy
    public void destroy() {
        session.close();
    }
}

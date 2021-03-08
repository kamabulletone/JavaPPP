package com.ru.pr14.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;


public class Team {

    @JsonProperty("name")
    private String name;

    @JsonProperty("date")
    private String creationDate;

    public Team(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}

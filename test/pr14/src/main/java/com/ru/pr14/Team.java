package com.ru.pr14;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {

    @JsonProperty("tname")
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

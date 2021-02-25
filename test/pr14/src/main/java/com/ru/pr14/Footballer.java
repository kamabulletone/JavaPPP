package com.ru.pr14;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Footballer {
    @JsonProperty("fname")
    private String firstName;

    @JsonProperty("flname")
    private String lastName;

    public Footballer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

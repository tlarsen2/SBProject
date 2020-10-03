package com.java.dto;

import java.util.UUID;

public class PersonDto {
    public PersonDto(){}

    public PersonDto(String firstName, String lastName, Integer number, UUID id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.id = id;
    }

    public UUID id;
    public String firstName = "";
    public String lastName = "";
    public Integer number;
}

package com.java.dao;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "person")
public class PersonDao {

    public PersonDao(){}

    public PersonDao(@NonNull String firstName, @NonNull String lastName, Integer number, UUID id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Integer number;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

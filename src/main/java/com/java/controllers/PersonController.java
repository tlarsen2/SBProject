package com.java.controllers;

import com.java.dao.PersonDao;
import com.java.services.PersonSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PersonController {
    private static Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonSvc service;

    @GetMapping("/person")
    public PersonDao getPerson(@RequestParam UUID id) {
        LOGGER.info("Getting Person by id {}", id);
        return service.findById(id);
    }

    @PostMapping("/person")
    public PersonDao savePerson(@RequestBody PersonDao person) {
        return service.save(person);
    }
}

package com.java.services;

import com.java.dao.PersonDao;

import java.util.List;
import java.util.UUID;

public interface PersonSvc {
    List<PersonDao> findAll();
    PersonDao findById(UUID id);
    PersonDao save(PersonDao person);
}

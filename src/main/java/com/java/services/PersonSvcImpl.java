package com.java.services;

import com.java.dao.PersonDao;
import com.java.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonSvcImpl implements PersonSvc {

    @Autowired
    private PersonRepo repo;

    @Override
    public List<PersonDao> findAll() {
        return (List<PersonDao>) repo.findAll();
    }

    @Override
    public PersonDao findById(UUID id) {
        return repo.findById(id).orElseGet(null);
    }

    @Override
    public PersonDao save(PersonDao person) {
        return repo.save(person);
    }
}

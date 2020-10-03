package com.java.repos;

import com.java.dao.PersonDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepo extends CrudRepository<PersonDao, UUID> {

}

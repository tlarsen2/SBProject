package com.java.transformers;

import com.java.dao.PersonDao;
import com.java.dto.PersonDto;

public class PersonTransformer {

    public PersonDao setDAO(PersonDto person) {
        return new PersonDao(person.firstName, person.lastName, person.number, person.id);
    }

    public PersonDto setDTO(PersonDao person) {
        return new PersonDto(person.getFirstName(), person.getLastName(), person.getNumber(), person.getId());
    }
}

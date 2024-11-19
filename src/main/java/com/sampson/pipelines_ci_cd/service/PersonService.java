package com.sampson.pipelines_ci_cd.service;

import com.sampson.pipelines_ci_cd.entities.Person;
import com.sampson.pipelines_ci_cd.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }
}

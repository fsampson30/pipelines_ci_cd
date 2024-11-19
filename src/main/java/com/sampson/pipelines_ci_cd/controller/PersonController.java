package com.sampson.pipelines_ci_cd.controller;

import com.sampson.pipelines_ci_cd.entities.Person;
import com.sampson.pipelines_ci_cd.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getALl(){
        return personService.getAll();
    }

    @RequestMapping ("/list")
    public List<String> getTestValues(){
        return List.of("Test1","Test2","Test3","Test4","Test5","Test6");
    }
}

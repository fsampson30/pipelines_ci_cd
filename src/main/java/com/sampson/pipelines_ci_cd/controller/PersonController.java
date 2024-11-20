package com.sampson.pipelines_ci_cd.controller;

import com.sampson.pipelines_ci_cd.entities.Person;
import com.sampson.pipelines_ci_cd.service.PersonService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Person findById(@PathVariable Long id){
        return personService.findById(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }

    @RequestMapping ("/list")
    public List<String> getTestValues(){
        return List.of("Test1","Test2","Test3","Test4","Test5","Test6");
    }
}

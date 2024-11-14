package com.sampson.pipelines_ci_cd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @GetMapping("/test")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping ("/list")
    public List<String> getTestValues(){
        return List.of("Test1","Test2","Test3","Test4","Test5","Test6");
    }
}

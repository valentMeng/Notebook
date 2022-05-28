package com.valent.notebook.controller;

import com.valent.notebook.mapper.PersonMapper;
import com.valent.notebook.pojo.Person;
import com.valent.notebook.service.PersonService;
import jodd.datetime.TimeUtil;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonMapper personMapper;

    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public List<Person> getPersons() {
        return personMapper.list();

    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") Integer id) {
        return personMapper.get(id);
    }

    @GetMapping("/hello")
    public String hello(){
        personService.hello();
        return "success" + System.currentTimeMillis();
    }


}

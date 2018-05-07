package com.chenpan.controller;

import com.chenpan.node.Person;
import com.chenpan.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    //通过演员名称查询演员信息
    @RequestMapping("/get")
    public List<Person> queryPersonName(String name){
        return personRepository.queryByPersonName(name);
    }


}

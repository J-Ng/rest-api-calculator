package com.rocketowl.poc.rest.api.mongodb.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rocketowl.poc.rest.api.mongodb.Repository.EmployeeRepository;
import com.rocketowl.poc.rest.api.mongodb.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/findByStatus")
    public String findByStatus(@RequestParam(name = "status") String status) {
        List<Employee> list = repository.findByStatus(status);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(list);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error";
        }
    }

    @GetMapping("/currentTime")
    public String currentTime () {
        return "Current Time is "+ (new Date(System.currentTimeMillis()));
    }

    @GetMapping("/findAll")
    public String findAll() {
        List<Employee> list = repository.findAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(list);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error";
        }
    }

}
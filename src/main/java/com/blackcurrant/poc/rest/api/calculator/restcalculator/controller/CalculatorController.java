package com.blackcurrant.poc.rest.api.calculator.restcalculator.controller;

import com.blackcurrant.poc.rest.api.calculator.restcalculator.Object.SamplePojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
class CalculatorController {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/addition")
    int replaceEmployee(@RequestParam(name = "num1") Integer num1, @RequestParam(name = "num2") Integer num2) {
        return num1+num2;
    }

    @GetMapping("/fibonacci")
    String fibonacci(@RequestParam(name = "input") Integer input) {
        int prevNum1 = 0, prevNum2 = 1, currNum;
        StringBuilder sb = new StringBuilder();

        System.out.print(prevNum1 + " " + prevNum2);

        for (int i = 2; i < input; ++i) {
            currNum = prevNum1 + prevNum2;
            sb.append(" " + currNum);
            prevNum1 = prevNum2;
            prevNum2 = currNum;
        }
        return sb.toString();
    }

    @GetMapping("/currentTime")
    String currentTime () {
        return "Current Time is "+ (new Date(System.currentTimeMillis()));
    }

    @GetMapping("/json_format")
    String json_format () {
        SamplePojo sample = new SamplePojo("John Doe", "johndoe@email.com", "Next Door", 35);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(sample);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "blank";
    }
}
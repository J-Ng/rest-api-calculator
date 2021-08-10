package com.rocketowl.poc.rest.api.mongodb.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Employee {

    @Id
    public String id;

    public String name;
    public String job_title;
    public String status;
    public Date start_date;

    public Employee() {}

    public Employee(String name, String job_title, String status, Date start_date) {
        this.name = name;
        this.job_title = job_title;
        this.status = status;
        this.start_date = start_date;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%s, name='%s', job_title='%s', status='%s', start_date='%s']",
                id, name, job_title, status, start_date);
    }

}


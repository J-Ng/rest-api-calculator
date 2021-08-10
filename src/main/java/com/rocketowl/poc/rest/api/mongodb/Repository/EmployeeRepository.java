package com.rocketowl.poc.rest.api.mongodb.Repository;

import com.rocketowl.poc.rest.api.mongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	public Employee findByName(String name);
	public List<Employee> findByStatus(String status);

}

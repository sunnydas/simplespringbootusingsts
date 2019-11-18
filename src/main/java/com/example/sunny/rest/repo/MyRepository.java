package com.example.sunny.rest.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.sunny.rest.model.Employee;

public interface MyRepository extends CrudRepository<Employee, Integer>{
	
	public Employee findById(int id);

}

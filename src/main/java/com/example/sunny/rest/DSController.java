package com.example.sunny.rest;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sunny.rest.model.Employee;
import com.example.sunny.rest.repo.MyRepository;

@RestController
public class DSController {
	
	@Autowired
	private MyRepository myRepository; 
	
	@RequestMapping(value = "/employees/{id}",method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") String id) {
	   return myRepository.findById(Integer.parseInt(id));				
	}
	
	
	@RequestMapping(value = "/employees",method = RequestMethod.POST)
	public Employee AddEmployee(@RequestBody Employee employee) {
		return myRepository.save(employee);		
	}
	
	

}

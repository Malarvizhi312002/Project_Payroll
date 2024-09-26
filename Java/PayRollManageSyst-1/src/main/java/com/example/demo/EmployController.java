package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployController {
	
	@Autowired
	private EmployService service;
	
	
	@GetMapping(value="/showAllEmploy")
	public List<Employ> showEmploy() {
		return service.showAll();
	}
	
	
	@GetMapping(value="/login1/{username}/{pass}")
	public int login1(@PathVariable("username") String user, @PathVariable("pass") String password) {
	    int result = service.login1(user, password);
	    System.out.println("Controller Count  " + result);
	    return result;
	}

	
	
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return service.searchEmploy(id);
	}
	
	@PostMapping(value="/addEmploy")
	public void addEmploy(@RequestBody Employ employ) {
		service.addEmploy(employ);
	}
	
	@DeleteMapping(value="/deleteEmploy/{id}")
	public void deleteEmploy(@PathVariable int id) {
		service.deleteEmploy(id);
	}
	@PutMapping(value="/updateEmploy")
	public void updateEmploy(@RequestBody Employ employ) {
		service.updateEmploy(employ);
	}

}

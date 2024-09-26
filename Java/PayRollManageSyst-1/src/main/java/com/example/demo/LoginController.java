package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping(value="/login/{user}/{password}")
	public int login(@PathVariable String user, @PathVariable String password) {
		int result = loginService.login(user, password);
		System.out.println("Controller Count  " +result);
		return result;
	}
}

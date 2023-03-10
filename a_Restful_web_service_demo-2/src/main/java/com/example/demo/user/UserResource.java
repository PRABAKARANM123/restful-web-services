package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired  
	private UserDaoService service;  
 
	@GetMapping("/users/{id}")  
	public User retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  

}

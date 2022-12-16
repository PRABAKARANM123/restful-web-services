package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserResource {
	@Autowired  
	private UserDaoService service;  
	@GetMapping("/userslist")  
	public List<User> retriveAllUsers()  
	{  
	return service.findAll();  
	}  

}

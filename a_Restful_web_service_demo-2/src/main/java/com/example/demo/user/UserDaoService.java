package com.example.demo.user;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users=new ArrayList<>(); 
	
	static {
		users.add(new User(1, "John", "Chennai"));  
		users.add(new User(2, "Robert", "Cbe"));  
		users.add(new User(3, "Adam", "Salem"));  
		users.add(new User(4, "Andrew", "Cbe"));  
		users.add(new User(5, "Jack", "Chennai"));
	}
		
	public User findOne(int id)  
	{  
	for(User user:users)  
	{  
	if(user.getId()==id)  
	return user;  
	}  
	return null;  
	}  

}

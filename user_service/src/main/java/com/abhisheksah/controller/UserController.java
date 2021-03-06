package com.abhisheksah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abhisheksah.entity.Contact;
import com.abhisheksah.entity.User;
import com.abhisheksah.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")int userId) {
		
		User user=this.userService.getUser(userId);
		List contacts=this.restTemplate.getForObject("http://contact-service/contact/"+user.getUserId(), List.class);
		user.setContacts(contacts);
		return user;
	}
	
}

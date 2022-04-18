package com.abhisheksah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhisheksah.entity.Contact;
import com.abhisheksah.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{userId}")
	public List<Contact> getContacts(@PathVariable("userId")int userId){
		return this.contactService.getContactsofUser(userId);
	}
}

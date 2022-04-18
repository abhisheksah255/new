package com.abhisheksah.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.abhisheksah.entity.Contact;

@Service
public class ContactServiceImplement implements ContactService{

	
	List<Contact> list=List.of(
			new Contact(123L,"abhishek@123","Aniket",101),
			new Contact(123L,"mohit@123","Mohit",101),
			new Contact(123L,"mohan@123","Mohan",102),
			new Contact(123L,"rohit@123","Rohit",102)
			);
	@Override
	public List<Contact> getContactsofUser(int userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->
		contact.getUserId()==userId).collect(Collectors.toList());
	}

}

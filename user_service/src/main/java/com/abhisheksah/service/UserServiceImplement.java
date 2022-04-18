package com.abhisheksah.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhisheksah.entity.User;

@Service
public class UserServiceImplement implements UserService{

	
	List<User>list=List.of(
			new User(101,"Abhishek","890789987"),
			new User(102,"Amandeep","890783453"),
			new User(103,"Neeraj","981789984")
			);
	
	
	@Override
    public User getUser(int id) {
        return list.stream().filter(user -> user.getUserId()==id).findAny().orElse(null);
    }


}

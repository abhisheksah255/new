package com.abhisheksah;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service 
public class BookService {

	Map<String,Book>bookdetails=new HashMap<String,Book>();
	
	public List<Book> getBookData(String bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Map<String,Book>bookData(){
		bookdetails.put("1", new Book(100,"computer",1000));
		return null;
	}
}

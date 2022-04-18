package com.abhisheksah;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
@GetMapping("/books/{bookId}")
public List<Book>getBookDetails(@PathVariable String bookId)	{
	String bookid=bookId;
	List<Book> response=new ArrayList<Book>();
	Book mybook=new Book();
	List<Book> booklist=bookService.getBookData(bookid);

	for(Book book: booklist) {
		mybook.setBookid(book.getBookid());
		mybook.setBookName(book.getBookName());
		mybook.setBookPrice(book.getBookPrice());
		response.add(mybook);
	}
	return response;
}
}

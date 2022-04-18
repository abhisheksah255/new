package com.abhisheksah;

public class Book {

	private int bookid;
	private String bookName;
	private int bookPrice;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookName, int bookPrice) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
}

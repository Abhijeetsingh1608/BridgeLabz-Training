package com.constructor.levelone;

public class Book {
	
	String title,author;
	double price;
	
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
    void displayBook() {
    	System.out.println("Author Name : " + author + " Book title :" +title+ " Book price :"+ price );
    	
    }
  
}

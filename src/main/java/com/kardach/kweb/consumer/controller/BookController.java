package com.kardach.kweb.consumer.controller;

import java.util.List;

import javax.inject.Inject;

import com.kardach.kweb.annotation.Delete;
import com.kardach.kweb.annotation.Get;
import com.kardach.kweb.annotation.Post;
import com.kardach.kweb.annotation.Put;
import com.kardach.kweb.annotation.Rest;
import com.kardach.kweb.consumer.model.Book;
import com.kardach.kweb.consumer.service.BookService;

@Rest(url = "/book")
public class BookController {

	@Inject
	private BookService bookService = new BookService();
	
	@Get
	public List<Book> findAll() {
		return bookService.findAll();
	}
	
	@Get(value="/{id}")
	public List<Book> findById(Long id) {
		return bookService.findAll();
	}
	
	@Post
	public long insert(Book book) {
		return bookService.insert(book);
	}
	
	@Put
	public long update(Book book) {
		return bookService.update(book);
	}
	
	@Delete("/{id}")
	public long delete(Long id) {
		return bookService.delete(id);
	}
}

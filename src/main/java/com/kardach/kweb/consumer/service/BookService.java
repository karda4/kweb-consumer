package com.kardach.kweb.consumer.service;

import java.util.List;

import javax.inject.Inject;

import com.kardach.kweb.consumer.model.Book;
import com.kardach.kweb.consumer.repository.BookRepository;

public class BookService {
	
	@Inject
	private BookRepository bookRepository = new BookRepository();

	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	public long insert(Book book) {
		return bookRepository.insert(book);
	}
	
	public long update(Book book) {
		return bookRepository.update(book);
	}
	
	public long delete(long id) {
		return bookRepository.delete(id);
	}
}

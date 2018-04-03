package com.kardach.kweb.consumer.repository;

import java.util.ArrayList;
import java.util.List;

import com.kardach.kweb.consumer.model.Book;

public class BookRepository {
	
	private Long lastId = 0L;
	private Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry");
	private Book book2 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
	private List<Book> books = new ArrayList<>();

	public BookRepository() {
		insert(book1);
		insert(book2);
	}
	
	public List<Book> findAll() {
		return books;
	}
	
	public Book findById(Long id) {
		return books.stream().filter(i -> id.equals(i.getId())).findFirst().orElseGet(null);
	}
	
	public long insert(Book book) {
		book.setId(nextId());
		books.add(book);
		return 1L;
	}
	
	public long update(Book book) {
		Book bookOld = findById(book.getId());
		if(bookOld != null) {
			books.remove(bookOld);
			books.add(book);
			return 1;
		}
		return 0;
	}
	
	public long delete(long id) {
		Book bookOld = findById(id);
		if(bookOld != null) {
			books.remove(bookOld);
			return 1;
		}
		return 0;
	}
	
	private Long nextId() {
		if(!books.isEmpty()) {
			lastId = books.stream().map(i -> i.getId()).max((i, j) -> Long.compare(i, j)).get();
		}
		lastId++;
		return lastId;
	}
}

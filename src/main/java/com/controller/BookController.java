package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Book;
import com.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;

	public Book save(Book book) {
		Book savedBook = bookService.save(book);
		return savedBook;
	}

	public Book findOne(Integer id) {
		return bookService.findOne(id);
	}

	public Iterable<Book> findAll(String id) {
		return bookService.findAll(id);
	}

	public void save(Integer id) {
		bookService.delete(id);
	}
}

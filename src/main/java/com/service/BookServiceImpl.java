package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookRepository;
import com.entity.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(com.entity.Book)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(com.entity.Book)
	 */
	public Book save(Book book) {
		Book savedBook = bookRepository.save(book);
		return savedBook;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findOne(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findOne(java.lang.Integer)
	 */
	public Book findOne(Integer id) {
		return bookRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findAll(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findAll(java.lang.String)
	 */
	public Iterable<Book> findAll(String id) {
		return bookRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(java.lang.Integer)
	 */
	public void delete(Integer id) {
		bookRepository.delete(id);
	}
}

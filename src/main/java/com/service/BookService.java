package com.service;

import com.entity.Book;

public interface BookService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(com.entity.Book)
	 */
	public abstract Book save(Book book);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findOne(java.lang.String)
	 */
	public abstract Book findOne(Integer id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#findAll(java.lang.String)
	 */
	public abstract Iterable<Book> findAll(String id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.BookService#save(java.lang.String)
	 */
	public abstract void delete(Integer id);

}
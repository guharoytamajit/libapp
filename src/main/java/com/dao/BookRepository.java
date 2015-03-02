package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}

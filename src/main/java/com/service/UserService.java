package com.service;

import com.entity.User;

public interface UserService {

	public abstract User save(User user);

	public abstract User findOne(String id);

	public abstract Iterable<User> findAll();

	public abstract void delete(String id);

}
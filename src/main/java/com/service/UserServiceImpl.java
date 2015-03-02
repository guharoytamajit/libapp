package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserRepository;
import com.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.UserService#save(com.entity.User)
	 */
	public User save(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.UserService#findOne(java.lang.String)
	 */
	public User findOne(String id) {
		return userRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.UserService#findAll(java.lang.String)
	 */
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.service.UserService#save(java.lang.String)
	 */
	public void delete(String id) {
		userRepository.delete(id);
	}
}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/save.htm")
	@ResponseBody
	public User save(@RequestBody User user) {
		User savedUser = userService.save(user);
		return savedUser;
	}

	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	@ResponseBody
	public User findOne(@PathVariable String id) {
		// return userService.findOne(id);
		User user = new User();
		user.setFirstName("tamajit");
		user.setLastName("guha roy");
		return user;
	}

	@RequestMapping(value = "/find.htm")
	@ResponseBody
	public Iterable<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "/delete/{id}.htm")
	public void delete(@PathVariable String id) {
		userService.delete(id);
	}
}

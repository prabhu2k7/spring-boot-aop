package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController
{

	@Autowired
	private UserService userService;

	@GetMapping("/adduser")
	public User addEmployee(@RequestParam("name") String name, @RequestParam("userId") String userId)
	{

		return userService.createUser(name, userId);

	}

	

}
package com.app.service;

import org.springframework.stereotype.Service;

import com.app.model.User;

@Service
public class UserService
{

	public User createUser(String name, String userId)
	{

		User user = new User();
		user.setName(name);
		user.setuserId(userId);
		return user;
	}

}
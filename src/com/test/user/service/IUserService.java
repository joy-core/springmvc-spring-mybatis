package com.test.user.service;

import java.util.List;

import com.test.user.model.User;

public interface IUserService {
	
	User getUserById(String id);
	
	List<User> getAllUser();
}

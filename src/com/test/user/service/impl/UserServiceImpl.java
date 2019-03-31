package com.test.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.user.dao.IUserDao;
import com.test.user.model.User;
import com.test.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUserById(String id) {
		User user = userDao.getUserById(id);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}

package com.test.user.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.test.user.model.User;

@MapperScan
public interface IUserDao {
	
	User getUserById(String id);
	
	List<User> getAllUser();
}

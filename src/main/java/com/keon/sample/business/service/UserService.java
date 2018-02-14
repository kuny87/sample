package com.keon.sample.business.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keon.sample.persistence.model.User;

@Repository
public interface UserService {

	boolean insertUser(User user);
	
	boolean updateUser(User user);
	
	boolean deleteUser(int userSeq);
	
	User selectUser(int userSeq);
	
	List<User> userList();
	
}

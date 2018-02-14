package com.keon.sample.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keon.sample.business.service.UserService;
import com.keon.sample.persistence.mapper.UserMapper;
import com.keon.sample.persistence.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public boolean insertUser(User user) {
		return userMapper.insertUser(user) == 1;
	}

	@Override
	public boolean updateUser(User user) {
		return userMapper.updateUser(user) == 1;
	}

	@Override
	public boolean deleteUser(int userSeq) {
		return userMapper.deleteUser(userSeq) == 1;
	}

	@Override
	public User selectUser(int userSeq) {
		return userMapper.selectUser(userSeq);
	}

	@Override
	public List<User> userList() {
		return userMapper.selectUserList();
	}

}

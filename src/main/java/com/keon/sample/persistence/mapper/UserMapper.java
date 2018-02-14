package com.keon.sample.persistence.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keon.sample.persistence.model.User;

@Repository
public interface UserMapper {

	int insertUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(int userSeq);
	
	User selectUser(int userSeq);
	
	List<User> selectUserList();
	
}

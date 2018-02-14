package com.keon.sample.business.service.user;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.keon.sample.business.service.UserService;
import com.keon.sample.persistence.model.User;
import com.keon.sample.test.SpringTest;

public class UserTest extends SpringTest {
	
	@Autowired
	UserService userService;

	@Test
	public void 회원가입() {
		
		User user = new User();
		
		user.setId("admin");
		user.setPw("1234");
		user.setName("keon");
		
		boolean result = userService.insertUser(user);
		
		assertTrue(result);
		
	}
	
	@Test
	public void 회원정보불러오기() {
		
		List<User> userList = userService.userList();
		
		System.out.println("아이디: " + userList.get(0).getId());
		System.out.println("이름: " + userList.get(0).getName());
		
		assertTrue(userList != null);

	}
	
	@Test
	public void 회원정보수정() {
		
		User user = new User();
		
		List<User> userList = userService.userList();
		
		user = userList.get(userList.size() - 1);
		
		user.setUserSeq(user.getUserSeq());
		user.setId("ID수정");
		user.setPw("PW수정");
		user.setName("이름수정");
		
		boolean result = userService.updateUser(user);
		
		assertTrue(result);
		
	}
	
	@Test
	public void 회원삭제() {
		
		User user = new User();
		
		List<User> userList = userService.userList();
		
		user = userList.get(userList.size() - 1);
		
		user.setUserSeq(user.getUserSeq());
		
		boolean result = userService.deleteUser(user.getUserSeq());
		
		assertTrue(result);
		
	}

}

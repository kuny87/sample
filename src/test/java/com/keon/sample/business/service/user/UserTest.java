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
	public void ȸ������() {
		
		User user = new User();
		
		user.setId("admin");
		user.setPw("1234");
		user.setName("keon");
		
		boolean result = userService.insertUser(user);
		
		assertTrue(result);
		
	}
	
	@Test
	public void ȸ�������ҷ�����() {
		
		List<User> userList = userService.userList();
		
		System.out.println("���̵�: " + userList.get(0).getId());
		System.out.println("�̸�: " + userList.get(0).getName());
		
		assertTrue(userList != null);

	}
	
	@Test
	public void ȸ����������() {
		
		User user = new User();
		
		List<User> userList = userService.userList();
		
		user = userList.get(userList.size() - 1);
		
		user.setUserSeq(user.getUserSeq());
		user.setId("ID����");
		user.setPw("PW����");
		user.setName("�̸�����");
		
		boolean result = userService.updateUser(user);
		
		assertTrue(result);
		
	}
	
	@Test
	public void ȸ������() {
		
		User user = new User();
		
		List<User> userList = userService.userList();
		
		user = userList.get(userList.size() - 1);
		
		user.setUserSeq(user.getUserSeq());
		
		boolean result = userService.deleteUser(user.getUserSeq());
		
		assertTrue(result);
		
	}

}

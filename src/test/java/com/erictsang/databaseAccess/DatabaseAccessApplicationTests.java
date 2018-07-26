package com.erictsang.databaseAccess;

import com.erictsang.databaseAccess.User;
import com.erictsang.databaseAccess.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemo2ApplicationTests {


	@Autowired
	private UserMapper userMapper;

	@Test
	public void test(){

		userMapper.insert("EricTsang", "g8$#QHGhVz&4Qwg!", "13488724327");
		User u = userMapper.findUserByPhone("13488724327");
		Assert.assertEquals("EricTsang", u.getName());
	}



}

package com.zkk.study.dao;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	private UseDao userDao;
	
	@Autowired
	private ConfigurableEnvironment evn;
	
	@Before
	public void init() {
		EnvironmentTestUtils.addEnvironment(evn, "app.admin.name=zkk");
		EnvironmentTestUtils.addEnvironment(evn, "app.admin.enable=true");
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddUser() {
		Assert.assertEquals(0, userDao.addUser("zkk"));

	}
	
	@Test
	public void testEnv() {
		Assert.assertEquals("zkk", evn.getProperty("app.admin.name"));
		Assert.assertEquals("true", evn.getProperty("app.admin.enable"));
	}

}

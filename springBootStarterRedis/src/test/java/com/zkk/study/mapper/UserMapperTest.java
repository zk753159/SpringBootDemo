package com.zkk.study.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	@Mock
	private UserMapper userMapper;
	
	@Test(expected = Exception.class)
	public void testUserMapper() {
		BDDMockito.given(userMapper.createUser("admin")).willReturn(Integer.valueOf(1));
		BDDMockito.given(userMapper.createUser("")).willReturn(Integer.valueOf(0));
		BDDMockito.given(userMapper.createUser(null)).willThrow(Exception.class);
		
		Assert.assertEquals(Integer.valueOf(1), userMapper.createUser("admin"));
		Assert.assertEquals(Integer.valueOf(0), userMapper.createUser(""));
		Assert.assertEquals(Integer.valueOf(0), userMapper.createUser(null));
		
		
	}

}

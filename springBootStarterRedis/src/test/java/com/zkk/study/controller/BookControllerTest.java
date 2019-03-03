package com.zkk.study.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BookControllerTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	
	@Test
	public void testBookController() {
		String url = "/book";
		String bookName = testRestTemplate.postForObject(url, null, String.class);
		Assert.assertEquals("book", bookName);
	}

}

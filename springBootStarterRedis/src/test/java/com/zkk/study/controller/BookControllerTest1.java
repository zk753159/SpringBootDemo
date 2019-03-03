package com.zkk.study.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers=BookController.class)
public class BookControllerTest1 {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void testBook1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/book")).
		andExpect(MockMvcResultMatchers.status().isOk());
	}
	
}

package com.zkk.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@RequestMapping(value ="/book")
	public String queryBook() {
		return "book";
	}

}

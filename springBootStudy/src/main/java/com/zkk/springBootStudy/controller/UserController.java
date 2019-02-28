package com.zkk.springBootStudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/user/name")
	public String queryUser(){
		System.out.println("queryUser......");
		return "zkk";
	}
}

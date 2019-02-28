package com.zkk.springBootStudy.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfo {
	
	@Autowired
	private List list;
	
	public void say() {
		for (Object str: list) {
			System.out.println("str....." + str);
		}
		System.out.println("userinfo.....");
	}

}

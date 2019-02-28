package com.zkk.springBootStudy.myconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class MyConfig {
	
	@Bean
	public List createList() {
		List list =  new ArrayList();
		list.add("a");
		list.add("b");
		return list;
	}
	
}

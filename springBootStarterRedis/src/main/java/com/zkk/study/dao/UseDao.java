package com.zkk.study.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UseDao {
	
	public int addUser(String usename) {
		if (usename == null) {
			return 1;
		} else {
			return 0;
		}
	}

}

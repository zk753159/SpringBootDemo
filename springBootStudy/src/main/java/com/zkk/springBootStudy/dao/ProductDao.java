package com.zkk.springBootStudy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addProduct(String name,String id) {
		String sql = "insert into product(product_id,product_name) values("+ id + ",'" + name+ "')";
		jdbcTemplate.execute(sql);
	}

}

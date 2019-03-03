package com.zkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zkk.product.bean.Product;
import com.zkk.product.mapper.ProductMapper;

@SpringBootApplication
public class App {
	
	public static void  main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		ProductMapper mapper = context.getBean(ProductMapper.class);
		Product p = new Product();
		p.setPname("12312");
		p.setPtype("21312");
		p.setPrice(23.23);;;
		mapper.addProduct(p);
		mapper.delProductById(1);
		context.close();
	}

}

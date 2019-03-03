package com.zkk.springBootStudy;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableAsync;

import com.zkk.springBootStudy.dao.ProductDao;
import com.zkk.springBootStudy.model.UserInfo;
import com.zkk.springBootStudy.myconfig.DataSourceProperties;
import com.zkk.springBootStudy.myconfig.FileConfig;
import com.zkk.springBootStudy.myconfig.TomcatProperties;
import com.zkk.springBootStudy.myconfig.UserConfig;



@SpringBootApplication
@EnableAsync
public class FirstApplication {
	
	
	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(FirstApplication.class, args);
//		SpringApplication springApplication = new SpringApplication();
//		HashSet<Object> set = new HashSet<>();
//		set.add(App.class);
//		springApplication.setSources(set);
//		ConfigurableApplicationContext context  = springApplication.run(args);
		
		System.out.println(context.getEnvironment().getProperty("local.ip"));
	//	Runnable bean = context.getBean(Runnable.class);
	//	bean.run();
		
		UserInfo user = context.getBean(UserInfo.class);
		user.say();
		
		UserConfig config = context.getBean(UserConfig.class);
		config.show();
		
//		JdbcConfig jdbcConfig = context.getBean(JdbcConfig.class);
//		jdbcConfig.show();
		
		DataSourceProperties dataSourceProperties = context.getBean(DataSourceProperties.class);
		dataSourceProperties.show();
		
		TomcatProperties tomcatProperties = context.getBean(TomcatProperties.class);
		System.out.println(tomcatProperties.getHosts());
		
		FileConfig fileConfig = context.getBean(FileConfig.class);
		fileConfig.show();
		
		Runnable runnable = context.getBean(Runnable.class);
		runnable.run();
		System.out.println("=============end===========");
		
		DataSource ds = context.getBean(DataSource.class);
		Connection connection = ds.getConnection();
		System.out.println("ds::::::" + ds);
		System.out.println("connection.getCatalog()::::::" + connection.getCatalog());
		connection.close();
		
		System.out.println("jdbcTemp::::" + context.getBean(JdbcTemplate.class));
		
		context.getBean(ProductDao.class).addProduct("BBBBB","123121");
		
	}
}

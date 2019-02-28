package com.zkk.springBootStudy.myconfig;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
@SpringBootConfiguration
@PropertySource( "classpath:config/user.properties")
@ConfigurationProperties(prefix = "my")
public class FileConfig {
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void show() {
		System.out.println(String.format("name:%s",username));
		System.out.println(String.format("password:%s",password));
	}
	
}

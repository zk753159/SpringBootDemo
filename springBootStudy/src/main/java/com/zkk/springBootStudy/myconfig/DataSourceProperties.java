package com.zkk.springBootStudy.myconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceProperties {
	
	private String url;
	
	private String driverClassName;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	
	public void show() {
		System.out.println(String.format("url value is:%s", url));
		System.out.println(String.format("driverClassName value is:%s", driverClassName));
	}
}

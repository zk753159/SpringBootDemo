package com.zkk.springBootStudy.myconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ds")
public class TomcatProperties {
	
	private List<String>hosts = new ArrayList<String>();

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}
	
	

}

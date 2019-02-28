package com.zkk.springBootStudy.myconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.core.env.Environment;
/**
 * 配置文件默认为application.yml/application.properties
 * 默认的路径是classpath/classpath.config
 * @author xiaojuan
 *
 */
@SpringBootConfiguration
public class UserConfig {
	
	@Autowired
	private Environment env;
	
	@Value("${local.ip}")
	private String localIp;
	@Value("${appname}")
	private String appname;
	
	/**
	 * @Value默认必须要配置，配置项可以为空，如果没有配置项，可以给默认值
	 */
	@Value("${default.port:9090}")
	private String defaultPort;
	
	public  void show() {
		System.out.println(String.format("local ip :%s", localIp));
		System.out.println(String.format("appname=%s", appname));
		System.out.println(String.format("defaultPort=%s", defaultPort));
	}


}

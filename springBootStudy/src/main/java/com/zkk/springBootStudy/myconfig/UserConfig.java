package com.zkk.springBootStudy.myconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.core.env.Environment;
/**
 * �����ļ�Ĭ��Ϊapplication.yml/application.properties
 * Ĭ�ϵ�·����classpath/classpath.config
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
	 * @ValueĬ�ϱ���Ҫ���ã����������Ϊ�գ����û����������Ը�Ĭ��ֵ
	 */
	@Value("${default.port:9090}")
	private String defaultPort;
	
	public  void show() {
		System.out.println(String.format("local ip :%s", localIp));
		System.out.println(String.format("appname=%s", appname));
		System.out.println(String.format("defaultPort=%s", defaultPort));
	}


}

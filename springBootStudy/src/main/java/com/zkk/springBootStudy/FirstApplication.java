package com.zkk.springBootStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {
	
//	@Bean
//	public Runnable createRunnable() {
//		return new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("spring boot is running");
//			}
//		};
//	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstApplication.class, args);
	//	context.getBean(Runnable.class);
	}
}

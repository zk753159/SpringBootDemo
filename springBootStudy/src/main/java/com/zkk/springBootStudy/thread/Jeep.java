package com.zkk.springBootStudy.thread;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Jeep implements Runnable {

	@Async
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("========" + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

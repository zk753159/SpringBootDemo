package com.zkk.springBootStudy.listen;

import org.springframework.context.ApplicationListener;

import com.zkk.springBootStudy.event.MyApplicationEvent;

/**
 * ���������
 * @author xiaojuan
 *
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent>{

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("���յ�");
		
	}

}

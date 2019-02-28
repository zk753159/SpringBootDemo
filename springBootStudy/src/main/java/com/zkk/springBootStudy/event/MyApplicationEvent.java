package com.zkk.springBootStudy.event;

import org.springframework.context.ApplicationEvent;
/**
 * 定义一个事件
 * @author xiaojuan
 *
 */
public class MyApplicationEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyApplicationEvent(MyApplicationEvent source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}

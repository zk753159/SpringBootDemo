package com.zkk.springBootStudy.thread;

/**
 * 线程同步 synchronized 线程同步
 * 方法一：
 * synchronized(this){ //锁对象
 * 		同步的方法
 * }
 * this:在这里就是锁对象
 * 锁只能有一把
 * 
 * 方法二：
 * 同步方法
 * public synchronized void fangfa(){
 * }
 * @author xiaojuan
 * 
 *
 */
public class SynchronizedDemo {
	
	public static void main(String[] args) {
		Money money = new Money();
		Thread t1 = new Thread(money,"aaaa");
		Thread t2 = new Thread(money,"bbbb");
		Thread t3 = new Thread(money,"cccc");
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}


class Money implements Runnable {

	public static int num = 10;
	
	@Override
	public  void run() {
			hongbao();
		}
	
	public synchronized void hongbao() {
		while(num > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName() + "抢到第" + num);
		num--;
		}
	}
	
}

package com.zkk.springBootStudy.thread;

/**
 * �߳�ͬ�� synchronized �߳�ͬ��
 * ����һ��
 * synchronized(this){ //������
 * 		ͬ���ķ���
 * }
 * this:���������������
 * ��ֻ����һ��
 * 
 * ��������
 * ͬ������
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
		System.out.println(Thread.currentThread().getName() + "������" + num);
		num--;
		}
	}
	
}

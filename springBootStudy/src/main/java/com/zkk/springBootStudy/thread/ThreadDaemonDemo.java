package com.zkk.springBootStudy.thread;

/**
 * join()����������ĳ������ִ�����е��������̵߳�join()����ʱ�������߳̽�������
 * yield()�������������õ�ǰ����ִ�е��߳���ͣ�����������������̣߳���ֻ�ǽ����߳�ת�����״̬ 
 * setDaemon() �ػ��߳� ��������ֻ���ػ��̣߳�������ֹ
 * 
 * @author xiaojuan
 * 
 */
public class ThreadDaemonDemo implements Runnable {
	private boolean flag;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public ThreadDaemonDemo(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadDaemonDemo(false), "����");
		Thread thread2 = new Thread(new ThreadDaemonDemo(true), "�Ƿ�");
		//�����ػ��߳� ��������ֻ���ػ��̣߳�����ͽ���������
		thread1.setDaemon(true);
	//	thread2.setDaemon(false);
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���Ӿ��������������������");
	}

	@Override
	public void run() {
		if (flag) {
			for (int i = 10; i > 0; i--) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "��ʣ" + i
						+ "��");

			}
		} else {
			for (int i = 100; i > 0; i--) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "��ʣ" + i
						+ "��");
			}
		}
	}

}

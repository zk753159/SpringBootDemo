package com.zkk.springBootStudy.thread;

/**
 * join()方法，当在某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞
 * yield()方法，它可以让当前正在执行的线程暂停，但它不会阻塞该线程，它只是将该线程转入就绪状态 
 * setDaemon() 守护线程 当程序中只有守护线程，程序终止
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
		Thread thread1 = new Thread(new ThreadDaemonDemo(false), "阿紫");
		Thread thread2 = new Thread(new ThreadDaemonDemo(true), "乔峰");
		//设置守护线程 当程序中只有守护线程，程序就结束。。。
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
		System.out.println("电视剧结束。。。。。。。。");
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
				System.out.println(Thread.currentThread().getName() + "还剩" + i
						+ "集");

			}
		} else {
			for (int i = 100; i > 0; i--) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "还剩" + i
						+ "集");
			}
		}
	}

}

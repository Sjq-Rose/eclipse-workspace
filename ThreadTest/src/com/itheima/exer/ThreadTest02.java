package com.itheima.exer;

/*
 * 编写一个应用程序创建两个线程，一个线程打印输出1～1000之间所有的奇数，

另外一个线程打印输出1～1000之间所有的偶数，

要求两个线程随机休眠一段时间后继续打印输出下一个数。请使用Runnable接口编程实现。
 */
class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 != 0) {
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}

	}
}

class MyThread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}

	}

}
    
public class ThreadTest02 {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		new Thread(m1, "线程一").start();
		new Thread(m2, "线程二").start();

	}

}

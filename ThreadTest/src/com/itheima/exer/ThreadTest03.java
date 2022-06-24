package com.itheima.exer;
/*
 * 编写一个应用程序创建两个线程，一个线程打印输出1～1000之间所有的奇数，

另外一个线程打印输出1～1000之间所有的偶数，

要求两个线程随机休眠一段时间后继续打印输出下一个数。请使用Tread类编程实现。
 */
class MyThread3 extends Thread{
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

class MyThread4 extends Thread {
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

public class ThreadTest03 {

	public static void main(String[] args) {
		MyThread3 m3 = new MyThread3();
        MyThread4 m4 = new MyThread4();
        m3.setName("线程一");
        m4.setName("线程二");
        m3.start();
        m4.start();
	}

}

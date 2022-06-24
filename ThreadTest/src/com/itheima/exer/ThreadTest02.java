package com.itheima.exer;

/*
 * ��дһ��Ӧ�ó��򴴽������̣߳�һ���̴߳�ӡ���1��1000֮�����е�������

����һ���̴߳�ӡ���1��1000֮�����е�ż����

Ҫ�������߳��������һ��ʱ��������ӡ�����һ��������ʹ��Runnable�ӿڱ��ʵ�֡�
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
		new Thread(m1, "�߳�һ").start();
		new Thread(m2, "�̶߳�").start();

	}

}

package com.itheima.exer;
/*
 * ��дһ��Ӧ�ó��򴴽������̣߳�һ���̴߳�ӡ���1��1000֮�����е�������

����һ���̴߳�ӡ���1��1000֮�����е�ż����

Ҫ�������߳��������һ��ʱ��������ӡ�����һ��������ʹ��Tread����ʵ�֡�
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
        m3.setName("�߳�һ");
        m4.setName("�̶߳�");
        m3.start();
        m4.start();
	}

}

package com.itheima.exer;

class Teacher implements Runnable {
	private int notebooks = 80;

	@Override
	public void run() {
		while (true) {
			if (notebooks > 0) {
				System.out.println(Thread.currentThread().getName() + " " + notebooks--);
			}else {
				break;
			}
		}
	}

	
}

public class ThreadTest01 {

	public static void main(String[] args) {
		Teacher test01 = new Teacher();
		new Thread(test01, "teacher1").start();
		new Thread(test01, "teacher2").start();
		new Thread(test01, "teacher3").start();

	}

}

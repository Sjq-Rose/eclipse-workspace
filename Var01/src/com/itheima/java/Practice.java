package com.itheima.java;

/*
 * ��������������������Σ�Triangle���࣬���������� (�ף�base���ߣ�height)��
 * �ṩ��Ӧ�Ĺ�������getset����������main��������������ε����
 */
class Triangle {
	int base;
	int height;
	public Triangle(int i, int j) {
		this.base = i;
		this.height = j;
	}
	public void get() {
		System.out.println( this.base* this.height / 2);
	}
}
public class Practice {

	public static void main(String[] args) {
		Triangle t = new Triangle(2,6);
		t.get();
	}
}

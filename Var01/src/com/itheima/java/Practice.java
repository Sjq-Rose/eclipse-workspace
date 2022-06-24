package com.itheima.java;

/*
 * 再来做个题嘛：定义三角形（Triangle）类，有两个属性 (底：base，高：height)，
 * 提供相应的构造器和getset方法，，在main方法中求出三角形的面积
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

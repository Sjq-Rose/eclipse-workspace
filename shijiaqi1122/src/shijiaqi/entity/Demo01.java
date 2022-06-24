package shijiaqi.entity;

import java.util.concurrent.locks.ReadWriteLock;
class Rectangle {
	double width;
	double height;

	public void set(double w, double h) {
		this.width = w;
		this.height = h;
	}

	public double  getArea() {
		return  this.height * this.width;
	}

	public void getPperimeter() {
		System.out.println(this.height*2 + this.width*2);
	}

}

public class Demo01 {

	public static void main(String[] args) {
		System.out.println(4.0);
		System.out.println(40.0);
		System.out.println(4.0*40.0);
		Rectangle r1 = new Rectangle();
		r1.set(4.0, 40.0);
		r1.getArea();
		r1.getPperimeter();

	}

}

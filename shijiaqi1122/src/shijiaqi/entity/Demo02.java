package shijiaqi.entity;

import java.util.Set;

class Box {
	int length;
	int width;
	int height;

	public void set(int l, int w, int h) {
		this.length = l;
		this.width = w;
		this.height = h;

	}

	public void volume() {
		System.out.println(this.height * this.length * this.width);

	}

}

public class Demo02 {

	public static void main(String[] args) {
		Box b = new Box();
		b.set(1, 2, 3);
		b.volume();

	}

}

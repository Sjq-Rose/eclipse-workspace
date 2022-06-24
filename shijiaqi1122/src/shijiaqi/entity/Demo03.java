package shijiaqi.entity;

class Point {
	private int pointX;
	private int pointY;

	public void set(int x, int y) {
		this.pointX = x;
		this.pointY = y;
	}

	public void display() {
		System.out.println(this.pointX);
		System.out.println(this.pointY);
	}
}

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.set(1, 1);
		p1.display();
		Point p2 = new Point();
		p2.set(12, 12);
		p2.display();
	}

}

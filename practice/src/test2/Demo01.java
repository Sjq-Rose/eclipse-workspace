package test2;

//import javax.lang.model.util.AbstractAnnotationValueVisitor14;

class Rectangle {
	double width;
	double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void set(double width, double height) {
		System.out.println(this.width);
		System.out.println(this.height);
	}

	public double getArea() {
		return this.height * this.width;
	}

	public double getPerimeter() {
		return (this.height * 2 + this.width * 2);
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,40);
		r1.set(4,40);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
	}

}

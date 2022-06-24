package shiijaqi.service;

class Person {
	private double weight;
	private double height;

	public Person(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		if (weight > 400 || weight < 0) {
			return 70.0;
		}
		return weight;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		if (height > 300 || height < 0) {
			return 170.0;
		}
		return height;
	}
}

public class Demo06 {

	public static void main(String[] args) {
		Person p1 = new Person(-100, 165.5);
		System.out.println(p1.getWeight());
		
		System.out.println(p1.getHeight());
		
		Person p2 = new Person(65.5, 400);
		System.out.println(p2.getWeight());
		
		System.out.println(p2.getHeight());

	}

}

package shiijaqi.controller;
class Person{
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
    public void setWeight() {
    	this.weight = weight;
    	
    }

	
	public double getHeight() {
		if (height > 300 || height < 0) {
			return 170.0;
		}
		return height;
	}

    public void  setHeight() {
    	this.height = height;
    }
}

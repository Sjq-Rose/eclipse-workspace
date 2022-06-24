package shijiaqi.entity;
class Cat {
	private String name;
	private int age;


	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;

	}
	public int getAge() {
		return age;
	}
}

	public  class Demo05 {

		public static void main(String[] args) {
			Cat c1 = new Cat("hi", 10);
			System.out.println(c1.getName());
			System.out.println(c1.getAge());
			Cat c2 = new Cat("miao");
			System.out.println(c2.getName());
			System.out.println(c2.getAge());
		}
	}

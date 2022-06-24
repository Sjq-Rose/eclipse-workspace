package shijiaqi.entity;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Person {

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	private String name;
	private int age;

	public String getName() { // 获取和改变成员变量的值。
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = age;
	}

	public void speak() {
		System.out.println("my name is =" + "name" + " it is= " + age + " years old");
	}
}

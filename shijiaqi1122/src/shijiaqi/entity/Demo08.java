package shijiaqi.entity;

import javax.accessibility.AccessibleStreamable;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
class Student {
	String name;
	int age;

	public Student(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public void show() {
		System.out.print("my name is"  +" " + this.name + ",");
		System.out.print("i am"  +" "+  this.age +" " + "years old.");
	}
}

public class Demo08 {
	public static void main(String[] args) {
		Student s = new Student("wang xio ming", 19);
		s.show();
	}
}
package com.itheima.java;
import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		int t = s1.length() - s2.length();
		return t;
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyComparator());

		ts.add("Jack");

		ts.add("Helena");

		ts.add("Eve");

		System.out.println(ts);

	}

}

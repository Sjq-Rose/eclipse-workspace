package com.itheima.java;

import java.util.ArrayList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Mary");
        list.add("Jack");
        list.add("Rose");
        list.forEach(o->{System.out.println(o);});
	}

}

package com.itheima.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
	public static List reverse(List list) {
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("1");

		list.add("2");

		list.add("3");

		for (Object obj : reverse(list))
			System.out.print(obj + ", ");

	}

}

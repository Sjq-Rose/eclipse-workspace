package com.itheima.exer;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add("b");

		ts.add("a");

		ts.add("c");

		ts.add("c");

		Iterator it = ts.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}

package com.itheima.java;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class MySet {

	public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(13);
        set.add(57);
        set.add(68);
        set.add(34);
        set.add(57);
        set.add(13);
        set.add(78);
        set.add(45);
        for (Integer integer : set) {
			System.out.println(integer);
		}
	}

}

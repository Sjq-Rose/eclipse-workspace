package com.itheima.java;

import java.sql.SQLIntegrityConstraintViolationException;

//A¡¢ µÝ¹éÇón! ²¢Êä³ö 5£¡
public class Example03 {
	public static int fact(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * fact(i - 1);
		}
	}

	public static void main(String[] args) {
		int i = 5;
		int f = fact(i);
		System.out.println(f);
	}
}
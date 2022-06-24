package com.itheima.java;

import java.util.Scanner;

public class Demo01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		double h;
		int c;
		Scanner in = new Scanner(System.in);
		c = in.nextInt();
		h = (9.0/5.0)*c + 32;
		System.out.println(String.format("%.2f",h ));
	
		
	}

}

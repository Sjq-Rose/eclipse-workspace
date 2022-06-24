package com.itheima.java;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		double r,h;
		Scanner in = new Scanner(System.in);
		r = in.nextDouble();
		h = in.nextDouble();
		double v;
		v = Math.pow(r,2)*h*Math.PI;
		System.out.println(String.format("%.2f",v));
		
		
		
		
		
	}

}

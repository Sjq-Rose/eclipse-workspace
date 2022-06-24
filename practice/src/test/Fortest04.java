package test;

import java.util.Scanner;

public class Fortest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int a, b, c;
		double s, p;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a + b > c && b + c > a && a + c > b) {
			p = (a + b + c) / 2;
			s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println(String.format("%.3f", s));
		} else {
			System.out.println("not valid");
		}
	}

}

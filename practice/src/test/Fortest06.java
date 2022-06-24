package test;

import java.util.Scanner;

public class Fortest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		 double t = b*b - 4*a*c;
		double x1, x2;
		if (a == 0 ) {
			System.out.println("not equation");
		}else if(t > 0) {
			x1 = (-b+Math.sqrt(t))/(2*a);
			x2 = (-b-Math.sqrt(t))/(2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}else if(t == 0) {
			x1 = (-b+Math.sqrt(t))/(2*a);
			System.out.println("x1=x2="+x1);
		}else {
			System.out.println("no real roots");
		}
		
	
	}

}

package test;

import java.util.Scanner;

public class Fortest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println(" ");
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
	    if(a < b) {
	    	int n = a;
	    	a = b;
	    	b = n;
		}
	    if(a < c) {
	    	int n = a;
	    	a = c;
	    	c = n;
	    }
	    if(b < c) {
	    	int n = b;
	    	b = c;
	    	c = n;
	    }
		System.out.println("");
		System.out.println(c +" " +b + " " + a);
		
		
		
		
	}

}

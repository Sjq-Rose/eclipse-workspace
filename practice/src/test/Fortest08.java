package test;

import java.util.Scanner;

public class Fortest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        int m,n;
        m = in.nextInt();
        n = in.nextInt();
        int min = (m <= n)?m:n;
        for(int i = min;i >= 1;i--) {
        	if(m % i == 0 && n % i == 0) {
        		System.out.println(i);
        		break;
        	}
        }
	}

}

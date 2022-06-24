package test;

import java.util.Scanner;

public class Fortest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int count,month;
		int day = 0;
		Scanner in = new Scanner(System.in);
		count = in.nextInt();
		month = in.nextInt();
		boolean isLeapYear = (count%4 == 0 && count%100!= 0 || count%400 == 0);
		switch (month) {
		case 1:
		case 3:
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
	        if(isLeapYear == true)
	        	day = 29;
	        else
	        	day = 28;
	        
	        break;
	        
		   
		}
		System.out.println(day);
		
	}

}

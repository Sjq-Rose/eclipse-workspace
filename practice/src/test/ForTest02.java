package test;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //国民生产总值的年增长率为8%，问多少年后翻一倍。
		System.out.println("请输入国民生产初总值：");
		Scanner in = new Scanner(System.in);
		double p = in.nextDouble();
		double gdp = p;
		int year = 0;
		for(; ;) {
			gdp *=(1+0.08);
			year ++;
			if(gdp >= 2*p) {
				break;
			}
		}
		System.out.println("在" +year +"年后国民生产总值翻一倍");
		//第二种：
		double h;
		int years = 0;
		for(p = 10000;p <= 20000;years ++){
			p*= (1+0.08);
		}
		System.out.println("在"+years + "年后国民生产总值翻一倍");
		
		//。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
		double n = 10000;
		int count = 0;
		while(n <= 20000) {
			n*= (1+0.08);
			count ++;
		}
		System.out.println("在"+count + "年后国民生产总值翻一倍");
		
		
		
		
		
		
	}

}

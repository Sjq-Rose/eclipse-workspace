package test2;

import java.util.Scanner;

/*
 * 用户从键盘输入两个正整数，输出它们的最大公约数。
【输入形式】两个正整数，用空格分隔
【输出形式】它们的最大公约数
【样例输入】3 4
【样例输出】1
 */
public class Demo03{
	public static void main(String[] args) {
		System.out.println("qingshuru:");
		int a,b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		int min =(a <= b)?a:b;
		for(int i = min; i >= 1; i --) {  //辗转相除法
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
			       break;
			}
		}
	}
}

 
	



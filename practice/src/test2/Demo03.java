package test2;

import java.util.Scanner;

/*
 * �û��Ӽ�������������������������ǵ����Լ����
��������ʽ���������������ÿո�ָ�
�������ʽ�����ǵ����Լ��
���������롿3 4
�����������1
 */
public class Demo03{
	public static void main(String[] args) {
		System.out.println("qingshuru:");
		int a,b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		int min =(a <= b)?a:b;
		for(int i = min; i >= 1; i --) {  //շת�����
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
			       break;
			}
		}
	}
}

 
	



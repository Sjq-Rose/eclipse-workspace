package test;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����������ֵ����������Ϊ8%���ʶ������һ����
		System.out.println("�����������������ֵ��");
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
		System.out.println("��" +year +"������������ֵ��һ��");
		//�ڶ��֣�
		double h;
		int years = 0;
		for(p = 10000;p <= 20000;years ++){
			p*= (1+0.08);
		}
		System.out.println("��"+years + "������������ֵ��һ��");
		
		//��������������������������������������������������������������������������
		double n = 10000;
		int count = 0;
		while(n <= 20000) {
			n*= (1+0.08);
			count ++;
		}
		System.out.println("��"+count + "������������ֵ��һ��");
		
		
		
		
		
		
	}

}

package com.itheima;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�߼������������
		int x = 0;//�������x,��ֵΪ0
		int y =0;//�������y,��ֵΪ0
		int z = 0;//�������z����ֵΪ0
		boolean a,b;//�������a,b
		a = x > 0 & y++ > 1;//&�Ա��ʽ���бȽ�//���false
		System.out.println("a="+a);
		System.out.println("y="+y);
		b = x > 0 && z++ > 1;//�Ա��ʽ���бȽϣ�ֻ����ߣ����false
		System.out.println("b="+b);
		System.out.println("z="+z);
		
	}

}

package com.itheima;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b = 3;
        short s = 4;
        char c = 5;
/*       byte b2 = b+s+c
 * ��byte,short,char����������ӣ��ٸ�ֵ��byte b2.
 * ע��ǿת
 */
        byte b2 = (byte)(b+s+c);
        System.out.println("b2="+b2);
	}

}

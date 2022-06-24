package com.itheima.date;

public class StringToBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //基本类型转String
		//将基本类型的值+" "即可
		int n1 = 100;
		float n2 = 1.1f;
		double n3 = 3.4;
		boolean n4 = true;
		String str1 = n1+"";
		String str2 = n2+"";
		String str3 = n3+"";
		String str4 = n4+"";
		System.out.print(str1+"" +str2+"" +str3 +"" +str4);
		System.out.println("================================");
		//String对应的数据类型
		//通过基本类型的包装类调用parseXX方法即可
		String s5 = "123";
		int num1 = Integer.parseInt(s5);//123
		double num2 = Double.parseDouble(s5);//123.0
		float num3 = Float.parseFloat(s5);//123.0
		long num4 = Long.parseLong(s5);//123
		byte num5 = Byte.parseByte(s5);//123
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
	}

}

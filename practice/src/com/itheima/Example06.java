package com.itheima;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //逻辑运算符的运用
		int x = 0;//定义变量x,其值为0
		int y =0;//定义变量y,其值为0
		int z = 0;//定义变量z，其值为0
		boolean a,b;//定义变量a,b
		a = x > 0 & y++ > 1;//&对表达式进行比较//输出false
		System.out.println("a="+a);
		System.out.println("y="+y);
		b = x > 0 && z++ > 1;//对表达式进行比较，只看左边，输出false
		System.out.println("b="+b);
		System.out.println("z="+z);
		
	}

}

package com.itheima.java;

public class Example02 {
    public static void main(String[] args) {
        Example01 p1 = new Example01();//������һ��Example01�����
        Example01  p2 = new Example01();//�����ڶ���Example01�����
        p1.age = 18;//Ϊage���Ը�ֵ
        p1.speak();//���ö���ķ���
        p2.speak();
    }
}

package com.itheima.java;

public class Example02 {
    public static void main(String[] args) {
        Example01 p1 = new Example01();//创建第一个Example01类对象
        Example01  p2 = new Example01();//创建第二个Example01类对象
        p1.age = 18;//为age属性赋值
        p1.speak();//调用对象的方法
        p2.speak();
    }
}

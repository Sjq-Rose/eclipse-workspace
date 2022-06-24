package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example31 {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("石佳琪");
        list.add("石美玉");
        list.add("琪欣");
        list.add("任泉诤");
        list.stream().filter(i -> i.startsWith("石"))
                     .limit(2)
                     .forEach(j -> System.out.println(j));
       
	}

}

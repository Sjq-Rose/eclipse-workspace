package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example31 {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ʯ����");
        list.add("ʯ����");
        list.add("����");
        list.add("��Ȫں");
        list.stream().filter(i -> i.startsWith("ʯ"))
                     .limit(2)
                     .forEach(j -> System.out.println(j));
       
	}

}

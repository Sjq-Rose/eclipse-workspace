package com.itheima.exer;

import java.util.*;

import java.util.Map.*;

public class Test04 {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, "Tom");

		map.put(2, "Lucy");

		map.put(3, "Annie");

		Set keySet = map.keySet();

		Iterator it = keySet.iterator();

		while (it.hasNext()) {

			Object key = it.next();
			Object value = map.get(key);// 获取每一个键对应的值
			System.out.println(key + " :" + value);
		}
		 map.remove(1);
		System.out.println(map);

	}

}

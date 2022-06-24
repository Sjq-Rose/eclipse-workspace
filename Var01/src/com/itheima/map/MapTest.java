package com.itheima.map;

import java.util.*;
import java.util.Map.*;

public class MapTest {
	public static void main(String[] args) {
		Map players = new HashMap();
		players.put("30", "Curry");
		players.put("35", "Durant");
		// 加入一个key为11（String类型），value为Thompson（String类型）的元素

		players.put("11", "Thompson");

		// 第一种：使用foreach二次取值
		// 通过Map.keySet遍历key和value：
		for (Object key : players.keySet()) {
			String number = (String) key;

			String name = (String) players.get(key);

			System.out.println("key=  " + number + "  and  value=  " + name);
		}
		// 第二种
		// 通过Map.entrySet使用iterator遍历key和value
		Set set = players.entrySet();

		Iterator it = players.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry) (it.next());
			String number = entry.getKey();
			String name = entry.getValue();

			System.out.println("key=  " + number + "  and  value=  " + name);
		}
		// 第三种
		// 使用values方法遍历输出所有value
		for (Object value : players.values()) {
			String name = (String) value;
			System.out.println("value=  " + name);
		}

	}
}

package com.itheima.map;

import java.util.*;
import java.util.Map.*;

public class MapTest {
	public static void main(String[] args) {
		Map players = new HashMap();
		players.put("30", "Curry");
		players.put("35", "Durant");
		// ����һ��keyΪ11��String���ͣ���valueΪThompson��String���ͣ���Ԫ��

		players.put("11", "Thompson");

		// ��һ�֣�ʹ��foreach����ȡֵ
		// ͨ��Map.keySet����key��value��
		for (Object key : players.keySet()) {
			String number = (String) key;

			String name = (String) players.get(key);

			System.out.println("key=  " + number + "  and  value=  " + name);
		}
		// �ڶ���
		// ͨ��Map.entrySetʹ��iterator����key��value
		Set set = players.entrySet();

		Iterator it = players.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry) (it.next());
			String number = entry.getKey();
			String name = entry.getValue();

			System.out.println("key=  " + number + "  and  value=  " + name);
		}
		// ������
		// ʹ��values���������������value
		for (Object value : players.values()) {
			String name = (String) value;
			System.out.println("value=  " + name);
		}

	}
}

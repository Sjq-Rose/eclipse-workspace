package com.itheima.exer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Demo04 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(Demo04::createAndShowGUI);
	}

	public static void createAndShowGUI() {
		// 创建一个名为GridLayout的网格布局管理器
		JFrame f = new JFrame("GridLayout");
		f.setLayout(new GridLayout(4, 4)); // 设置该窗体为4*4的网格
		f.setSize(300, 300); // 设置窗体大小
		f.setLocation(400, 300);
		// 下面的代码是循环添加8个按钮组件到GridLayout容器中
		for (int i = 1; i <= 16; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn);
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

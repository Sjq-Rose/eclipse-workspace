package com.itheima.exer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Demo03 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(Demo03::creatAndShowGUI);
	}

	public static void creatAndShowGUI() {
		// 创建一个名为Flowlayout的流式布局管理器
		JFrame f = new JFrame("Flowlayout");
		// 设置窗体中的布局管理器为FlowLayout，
		// 所有组件中间对齐，水平间距为20，垂直间距为30
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		f.setSize(400, 200); // 设置窗体大小
		f.setLocation(300, 200); // 设置窗体显示的位置
		// 向容器添加组件
		f.add(new JButton("第1个按钮"));
		f.add(new JButton("第2个按钮"));
		f.add(new JButton("第3个按钮"));
		f.add(new JButton("第4个按钮"));
		f.add(new JButton("第5个按钮"));
		f.setVisible(true); // 设置窗体可见
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

package com.itheima.exer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import java.awt.*;

public class Demo02 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Demo02::creatAndShowGUI);

	}

	public static void creatAndShowGUI() {
		// 设置窗体的布局管理器为BorderLayout(边界布局管理器）
		JFrame f1 = new JFrame("BorderLayout");
		f1.setLayout(new BorderLayout());
		f1.setSize(400, 400);
		f1.setLocation(400, 300);
		JButton but1 = new JButton("PAGE_START");
		JButton but2 = new JButton("PAGE_END");
		JButton but3 = new JButton("LINE_START");
		JButton but4 = new JButton("LINE_END");
		JButton but5 = new JButton("CENTER");
		f1.add(but1, BorderLayout.PAGE_START);
		f1.add(but2, BorderLayout.PAGE_END);
		f1.add(but3, BorderLayout.LINE_START);
		f1.add(but4, BorderLayout.LINE_END);
		f1.add(but5, BorderLayout.CENTER);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

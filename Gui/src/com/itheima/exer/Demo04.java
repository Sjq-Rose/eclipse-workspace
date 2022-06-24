package com.itheima.exer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Demo04 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(Demo04::createAndShowGUI);
	}

	public static void createAndShowGUI() {
		// ����һ����ΪGridLayout�����񲼾ֹ�����
		JFrame f = new JFrame("GridLayout");
		f.setLayout(new GridLayout(4, 4)); // ���øô���Ϊ4*4������
		f.setSize(300, 300); // ���ô����С
		f.setLocation(400, 300);
		// ����Ĵ�����ѭ�����8����ť�����GridLayout������
		for (int i = 1; i <= 16; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn);
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

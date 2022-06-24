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
		// ����һ����ΪFlowlayout����ʽ���ֹ�����
		JFrame f = new JFrame("Flowlayout");
		// ���ô����еĲ��ֹ�����ΪFlowLayout��
		// ��������м���룬ˮƽ���Ϊ20����ֱ���Ϊ30
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		f.setSize(400, 200); // ���ô����С
		f.setLocation(300, 200); // ���ô�����ʾ��λ��
		// ������������
		f.add(new JButton("��1����ť"));
		f.add(new JButton("��2����ť"));
		f.add(new JButton("��3����ť"));
		f.add(new JButton("��4����ť"));
		f.add(new JButton("��5����ť"));
		f.setVisible(true); // ���ô���ɼ�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

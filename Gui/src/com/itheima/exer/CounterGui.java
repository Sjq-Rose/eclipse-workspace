package com.itheima.exer;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;

import javax.swing.*;

/**
 * ���һ���򵥵����������������Ҫ��
 * 
 * ����Swing���ͼ�ν���
 * 
 * ֧�ּӼ��˳������������
 * 
 * ֧��С����ȷ���㣬����Bigdecimal������ֵ����
 * 
 * ֧���쳣��������û�����Ĳ�����ֵ������������ʾ
 * 
 * ������ο���
 * 
 * ����ͼ�������=����ťʱ�����Ҳ���ʾ������
 * 
 * @author 1
 *
 */
public class CounterGui {
	static JFrame f = new JFrame("�������������");
	public static void GuiCt() {
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		f.setSize(600, 200);
		f.setLocation(500, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jb1 = new JTextField(10);
		JComboBox<Character> jb2 = new JComboBox<>();
		JTextField jb3 = new JTextField(10);
		JButton jb4 = new JButton("=");
        JLabel  result = new JLabel();

		// Ϊjb2���������ѡ��
		jb2.addItem('+');	
		jb2.addItem('-');
		jb2.addItem('*');
		jb2.addItem('/');
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jb4);
		f.add(result);
		jb4.addActionListener(new  CounterGui().new MyActionListener(jb1,jb3,result,jb2));
		f.setVisible(true);
	}

	public static void main(String[] args) {
		GuiCt();
	}

	class MyActionListener implements ActionListener {
		JTextField jb1;
		JTextField jb3;
		JLabel result;
		JComboBox<Character> jb2;
		char op;

		public MyActionListener(JTextField jb1, JTextField jb3, JLabel result, JComboBox<Character> jb2) {
			super();
			this.jb1 = jb1;
			this.jb3 = jb3;
			this.result = result;
			this.jb2 = jb2;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			BigDecimal x = null;
			BigDecimal y = null;
			try {
				x = new BigDecimal(jb1.getText());
				y = new BigDecimal(jb3.getText());
			}catch(Exception c) {
				JDialog dialog = new JDialog(f,"�޷�����",true);
				dialog.setSize(200,30);
				dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
				dialog.setVisible(true);
				return;
			}
			this.op = (Character)jb2.getSelectedItem();
			BigDecimal z = null;
			switch (op) {
			case '+':
				z = x.add(y);
				break;
			case '-':
				z = x.subtract(y);
				break;
			case '*':
				z = x.multiply(y);
				break;
			case '/':
				z = x.divide(y);
				break;

			}
			result.setText(z.toString());
		}

	}
}

package com.itheima.exer;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;

import javax.swing.*;

/**
 * 设计一个简单的四则运算计算器，要求
 * 
 * 利用Swing设计图形界面
 * 
 * 支持加减乘除四种运算操作
 * 
 * 支持小数精确运算，请用Bigdecimal进行数值运算
 * 
 * 支持异常处理，如果用户输入的不是数值，弹出错误提示
 * 
 * 【界面参考】
 * 
 * 如下图，点击“=”按钮时，在右侧显示计算结果
 * 
 * @author 1
 *
 */
public class CounterGui {
	static JFrame f = new JFrame("四则运算计算器");
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

		// 为jb2添加下拉框选项
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
				JDialog dialog = new JDialog(f,"无法运算",true);
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

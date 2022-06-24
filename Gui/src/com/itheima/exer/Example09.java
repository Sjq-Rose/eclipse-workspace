package com.itheima.exer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example09 {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(Example09::createAndShowGUI);
	}

	private static void createAndShowGUI() {
		JFrame f = new JFrame("KeyEvent");
         f.setLayout(new FlowLayout());//为窗口设置布局
         f.setSize(400,300);
         f.setLocation(300,200);
         JTextField tf = new JTextField(30);//创建文本框对象
         f.add(tf);//在窗口中添加文本框组件
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //为文本框添加键盘事件监听器
         tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				int keyCode = e.getKeyCode();
				System.out.println("键盘按下的字符内容为："+ keyChar+ " ");
				System.out.println("键盘按下的字符代码为："+ keyCode+" ");
			}
         });
	}

}

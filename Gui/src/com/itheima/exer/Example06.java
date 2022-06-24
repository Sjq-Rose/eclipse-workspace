package com.itheima.exer;

import java.awt.event.*;
import javax.swing.*;

//自定义事件监听器类
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("用户点击了JBtton按钮组件");
	}

}

public class Example06 {
	public static void main(String[] args) {
        
        SwingUtilities.invokeLater(Example06::createAndShowGUI);
        		
	}

	public static void createAndShowGUI() {
		JFrame f = new JFrame("JFrame窗口");
        f.setSize(200,100);
        //创建一个按钮组件作为事件源
        JButton btn = new JButton("按钮");
        //为按钮组事件源添加自定义监听器
		btn.addActionListener(new MyListener());
        f.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

package com.itheima.exer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example08 {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(Example08::createAndShowGUI);
	}

	private static void createAndShowGUI() {
		JFrame  f  = new JFrame("MouseEvent");
        f.setLayout(new FlowLayout());//为窗口设置布局
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but = new JButton("Button");//创建按钮对象
        f.add(but); //在窗口下添加按钮组件
        but.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked-鼠标完成单击事件");
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed-鼠标下按事件");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased-鼠标放开事件");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(" mouseEntered-鼠标进入按钮区域事件");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited-鼠标退出按钮区域事件");
				
			}
        	
        });
	}

}

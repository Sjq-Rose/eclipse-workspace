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
        f.setLayout(new FlowLayout());//Ϊ�������ò���
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but = new JButton("Button");//������ť����
        f.add(but); //�ڴ�������Ӱ�ť���
        but.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked-�����ɵ����¼�");
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed-����°��¼�");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased-���ſ��¼�");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(" mouseEntered-�����밴ť�����¼�");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited-����˳���ť�����¼�");
				
			}
        	
        });
	}

}

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
         f.setLayout(new FlowLayout());//Ϊ�������ò���
         f.setSize(400,300);
         f.setLocation(300,200);
         JTextField tf = new JTextField(30);//�����ı������
         f.add(tf);//�ڴ���������ı������
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //Ϊ�ı�����Ӽ����¼�������
         tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				int keyCode = e.getKeyCode();
				System.out.println("���̰��µ��ַ�����Ϊ��"+ keyChar+ " ");
				System.out.println("���̰��µ��ַ�����Ϊ��"+ keyCode+" ");
			}
         });
	}

}

package com.itheima.exer;

import java.awt.event.*;
import javax.swing.*;

//�Զ����¼���������
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�û������JBtton��ť���");
	}

}

public class Example06 {
	public static void main(String[] args) {
        
        SwingUtilities.invokeLater(Example06::createAndShowGUI);
        		
	}

	public static void createAndShowGUI() {
		JFrame f = new JFrame("JFrame����");
        f.setSize(200,100);
        //����һ����ť�����Ϊ�¼�Դ
        JButton btn = new JButton("��ť");
        //Ϊ��ť���¼�Դ����Զ��������
		btn.addActionListener(new MyListener());
        f.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

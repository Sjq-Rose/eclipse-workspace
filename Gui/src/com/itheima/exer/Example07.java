package com.itheima.exer;
import java.awt.event.*;
import javax.swing.*;
public class Example07 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Example07::createaAndShowGUI);
	}

	private static void createaAndShowGUI() {
		JFrame f = new JFrame("WindowEvent");
		f.setBounds(0,0,400,300);
//        f.setSize(400,300);
//		f.setLocation(300,200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ʹ���ڲ��ഴ��WindowListenerʵ�����󣬼��������¼�
		f.addWindowListener(new WindowListener(){

			@Override
			public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened--������¼�");				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				 System.out.println("windowClosing--�������ڹر��¼�");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				 System.out.println("windowClosed--����ر��¼�");
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				 System.out.println("windowIconified--����ͼ�껯�¼�");
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified--����ȡ��ͼ�껯�¼�");
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated--���弤���¼�");				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated--����ͣ���¼�");
				
			}
			
		});
	}

}


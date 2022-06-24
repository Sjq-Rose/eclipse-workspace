package com.itheima.exer;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//JFrame:窗口
public class Demo01 {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(Demo01::createAndShowGUI);
	}

	public static void createAndShowGUI() {
		JFrame jf1 = new JFrame("shijiaqi");
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLocation(100,50);
        jf1.setSize(400,300);
        jf1.setVisible(true);
	   //JDialog：对话框窗口
        JDialog jd1 = new JDialog(jf1,"test",true);
	    jd1.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
	    jd1.setLocation(150,60);
	    jd1.setSize(200,150);
	    jd1.setVisible(true);
	}

}

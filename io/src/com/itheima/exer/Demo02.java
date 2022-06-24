package com.itheima.exer;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;

public class Demo02 {

	public static void main(String[] args) {
        //��֤һ���ļ�����ز���
		File file = new File("example.txt"); 
		System.out.println("�ļ�����:"+ file.getName());
		System.out.println("�ļ������·��:"+ file.getPath());
		System.out.println("�ļ��ľ���·��:"+ file.getAbsolutePath());
		System.out.println("�ļ��ĸ�·��:"+ file.getParent());
		System.out.println(file.canRead() ? "�ļ��ɶ�":" �ļ����ɶ�");
		System.out.println(file.canWrite() ? "�ļ���д" : " �ļ�����д");
		System.out.println(file.isFile() ? "��һ���ļ�" : " ����һ���ļ�");
		//����һ��Ŀ¼����ز���
		System.out.println(file.isDirectory()? "��һ��Ŀ¼" : " ����һ��Ŀ¼");
		//����һ������·������ز���
		System.out.println(file.isAbsolute()? "�Ǿ���·��" : "���Ǿ���·��");
		//���ض���ʽ���ļ�����޸�ʱ����� 
		Date date = new Date( file.lastModified());
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("����޸�ʱ��Ϊ:"+ df.format(date));
		System.out.println("�ļ���СΪ:" + file.length() + " bytes");
	  //System.out.println(" �Ƿ�ɹ�ɾ���ļ�:" + file.delete());
	}

}

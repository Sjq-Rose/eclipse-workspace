package com.itheima.exer;

import java.io.File;

public class Demo06 {

	public static void main(String[] args) {
		// ɾ���ļ��е�����
		File files = new File("D:\\Word�ĵ�\\�½��ļ���");
    	deleteDir(files);
		// ��֤��һ���ļ��������ݣ�����ļ�����delete������������ɾ��
		//files.delete();
	}

	public static void deleteDir(File files) {
        File[] liFiles = files.listFiles();
        for (File file : liFiles) {
        	if (file.isDirectory()) {
				deleteDir(file);
			}
			file.delete();
		}
	        files.delete();
	
	}

}

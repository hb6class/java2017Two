package com.hb.day27;

import java.io.File;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// io
		// 1.File
//		System.out.println("C:\\jtest\\test\\test3.txt");
//		System.out.println("./jtest/test/test3.txt");
		java.io.File f = new File(".\\test");
		// ���� ����Ȯ��
		System.out.println("��������:"+f.exists());
		
		if(f.exists()){
			System.out.println("�����ΰ�:"+f.isFile());
			System.out.println("���丮�ΰ�:"+f.isDirectory());
			if(f.isFile()){
				System.out.println("����ũ��:"+f.length()+"byte");
				System.out.println("�б����:"+f.canRead());
				System.out.println("�������:"+f.canWrite());
				System.out.println("�������:"+f.canExecute());
				System.out.println("���ϰ�Ψ�:"+f.getPath());
				System.out.println("���ϰ�Ψ�:"+f.getAbsolutePath());
				try {
					System.out.println("���ϰ�Ψ�:"+f.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���ϰ�θ�:"+f.getParent());
				System.out.println("�����̸���:"+f.getName());
			}else if(f.isDirectory()){
				File[] fs=f.listFiles();
				for(int i=0; i<fs.length; i++){
					System.out.println(fs[i].getName());
				}
			}
		}
	}

}















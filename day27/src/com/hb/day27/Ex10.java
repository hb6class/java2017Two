package com.hb.day27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="�ȳ��ڹ� �ڹ� ����";
		String path="C:\\jtest\\test\\test4.txt";
		File f=new File(path);
		FileOutputStream fos=null;
		try {
//			if(f.createNewFile()){
				System.out.println("������ ����������ϴ�");
				fos=new FileOutputStream(f);
				
				fos.write(msg.getBytes());
				System.out.println("���Ͽ� �ۼ� �Ϸ�");
//			}else{
//				System.out.println("���� ���� ����");
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

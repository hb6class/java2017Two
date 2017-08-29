package com.hb.day27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="안녕자바 자바 월드";
		String path="C:\\jtest\\test\\test4.txt";
		File f=new File(path);
		FileOutputStream fos=null;
		try {
//			if(f.createNewFile()){
				System.out.println("파일이 만들어졌습니다");
				fos=new FileOutputStream(f);
				
				fos.write(msg.getBytes());
				System.out.println("파일에 작성 완료");
//			}else{
//				System.out.println("파일 생성 실패");
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

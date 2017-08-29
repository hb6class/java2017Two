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
		// 파일 존재확인
		System.out.println("존재유무:"+f.exists());
		
		if(f.exists()){
			System.out.println("파일인가:"+f.isFile());
			System.out.println("디렉토리인가:"+f.isDirectory());
			if(f.isFile()){
				System.out.println("파일크기:"+f.length()+"byte");
				System.out.println("읽기권한:"+f.canRead());
				System.out.println("쓰기권한:"+f.canWrite());
				System.out.println("실행권한:"+f.canExecute());
				System.out.println("파일경로①:"+f.getPath());
				System.out.println("파일경로②:"+f.getAbsolutePath());
				try {
					System.out.println("파일경로③:"+f.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("파일경로만:"+f.getParent());
				System.out.println("파일이름만:"+f.getName());
			}else if(f.isDirectory()){
				File[] fs=f.listFiles();
				for(int i=0; i<fs.length; i++){
					System.out.println(fs[i].getName());
				}
			}
		}
	}

}















package com.hb.day27;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// c:\jtest\test
		// d--- test1
		// d--- test2
		// -rwx test3.txt
		// 1개 파일			3byte
		// 2개 디렉토리		
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String path=sc.nextLine();
		File f= new File(path);
		if(f.exists()){
			if(f.isDirectory()){
				int fsize=0;
				int fcnt=0;
				int dcnt=0;
				File[] fs= f.listFiles();
				for(File file : fs){
					if(file.isDirectory()){
						dcnt++;
						System.out.print("d---\t");
					}else{
						fsize+=file.length();
						fcnt++;
						System.out.print("-");
						if(file.canRead()){
							System.out.print("r");
						}else{
							System.out.print("-");							
						}
						if(file.canWrite()){
							System.out.print("w");
						}else{
							System.out.print("-");							
						}
						if(file.canExecute()){
							System.out.print("x");
						}else{
							System.out.print("-");							
						}
						System.out.print("\t");
					}
					
					System.out.print(new Date(file.lastModified()));
					System.out.println(file.getName());
				}
				System.out.println(fcnt+"개 파일\t\t"+fsize+"byte");
				System.out.println(dcnt+"개 디렉토리");
				
			}else{
				System.out.print("-");
				if(f.canRead()){
					System.out.print("r");
				}else{
					System.out.print("-");							
				}
				if(f.canWrite()){
					System.out.print("w");
				}else{
					System.out.print("-");							
				}
				if(f.canExecute()){
					System.out.print("x");
				}else{
					System.out.print("-");							
				}
				System.out.print("\t");
				System.out.print(new Date(f.lastModified()));
				System.out.println(f.getName());
			}
			
		}else{
			
			System.out.println("존재하지 않는 경로입니다");
		}
		
	}

}











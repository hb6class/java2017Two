package com.hb.day27;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// \
//		Scanner sc = new Scanner(System.in);
		InputStream input = System.in;// 1바이트=8비트=2의8승
		while(true){
			System.out.print(">");
			int su=input.read();
			if(su==-1){
				break;
			}
			System.out.println(su);
		}
//		System.out.println("\r\n");
//		System.out.println((char)13=='\r');
//		System.out.println((char)10=='\n');
	}

}

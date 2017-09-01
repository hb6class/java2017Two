package com.hb.day29;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex10 {

	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			fw=new FileWriter("./files/test2.txt");
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			pw.println("문자열스트림으로");
			pw.println("버퍼를 이용해서");
			pw.println("프린트라이터로 쉽게 작성");
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			pw.close();
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

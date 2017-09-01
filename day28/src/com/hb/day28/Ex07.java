package com.hb.day28;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream sout=System.out;
		String msg ="java";
		try {
//			sout.write("java");
			sout.write(msg.getBytes());
			sout.write('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
		sout.print("java");
		sout.println("java");
	}

}

package com.hb.day27;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\jtest\\test\\test6.bin");
		
		FileInputStream fis=null;
		DataInputStream dis=null;
		byte[] buff=new byte[4];
		try {
			fis=new FileInputStream(f);
			dis=new DataInputStream(fis);
			System.out.println(dis.read(buff));
			System.out.println(new String(buff));
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

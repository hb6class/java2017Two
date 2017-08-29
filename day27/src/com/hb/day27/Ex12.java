package com.hb.day27;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		// DataStream
		// DataInputStream
		// DataOutputStream
		
		File f=new File("C:\\jtest\\test\\test6.bin");
		
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			if(f.createNewFile()){
				fos=new FileOutputStream(f);
				dos=new DataOutputStream(fos);
				dos.write("java".getBytes());
				dos.writeInt(1234);
				dos.writeDouble(3.14);
				dos.writeBoolean(false);
				dos.writeChar('한');
				dos.writeUTF("자바월드");
			}
			System.out.println("작업완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}





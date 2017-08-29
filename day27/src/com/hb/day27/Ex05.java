package com.hb.day27;

import java.io.File;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=File.createTempFile("myTemp01", ".test");
			
			System.out.println(f.getName());
			System.out.println(f.getCanonicalPath());
			Thread.sleep(2000);
			f.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

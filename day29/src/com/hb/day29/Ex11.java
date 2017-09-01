package com.hb.day29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader("files/test2.txt");
			br=new BufferedReader(fr);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){
					break;
				}
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

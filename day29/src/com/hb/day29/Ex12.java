package com.hb.day29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Ex12 {

	public static void main(String[] args) {
		//StreamTokenizer \n, \r, " ",\t 
		FileReader fr=null;
		BufferedReader br=null;
		StreamTokenizer st=null;
		
		try {
			fr=new FileReader("files/test2.txt");
			br=new BufferedReader(fr);
			st=new StreamTokenizer(br);
			while(st.nextToken()!=StreamTokenizer.TT_EOF){
				if(st.ttype==StreamTokenizer.TT_WORD){
				System.out.println(st.sval);	//문자열
				}else if(st.ttype==StreamTokenizer.TT_NUMBER){
				System.out.println(st.nval);	//숫자			
				}
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

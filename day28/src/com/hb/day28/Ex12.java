package com.hb.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
	Scanner sc = new Scanner(System.in);
	ArrayList<int[]> stus=new ArrayList<int[]>();
	File f;
	
	public Ex12() {
		f= new File("txt/student.bin");
		FileInputStream fis=null;
		if(f.exists()){
			try {
				fis=new FileInputStream(f);
				Scanner sc =new Scanner(fis);
				while(sc.hasNextLine()){
					String tmp=sc.nextLine();
					
					String[] st = tmp.split(" ");
					int[] stu=new int[st.length];
					for(int i=0; i<st.length; i++){
						stu[i]=Integer.parseInt(st[i]);
					}
					stus.add(stu);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			///////////////
//			String msg="";
//			FileReader br=null;
//			char[] cbuf=new char[50];
//			try {
//				br = new FileReader(f);
//				while(true){
//					int su=br.read(cbuf);
//					if(su==-1){break;}
//					msg+=new String(cbuf,0,su);
//				}
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally{
//				try {
//					br.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			String[] lines=msg.split("\n");
//			for(int i=0; i<lines.length; i++){
//				String[] line=lines[i].split(" ");
//				int[] stu=new int[4];
//				for(int j=0; j<stu.length; j++){
//					stu[j]=Integer.parseInt(line[j]);
//				}
//				stus.add(stu);
//			}
			
		}else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		gameStart();
	}
	
	public void show(){
		System.out.println("---------------------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("---------------------------------------");
		for(int i=0; i<stus.size(); i++){
			int[] stu=stus.get(i);
			System.out.print(stu[0]);
			System.out.print('\t');
			System.out.print(stu[1]);
			System.out.print('\t');
			System.out.print(stu[2]);
			System.out.print('\t');
			System.out.println(stu[3]);
		}
		System.out.println("---------------------------------------");
	}
	
	public void add(){
		int[] stu=new int[4];
		System.out.print("학번>");
		stu[0]=sc.nextInt();
		System.out.print("국어>");
		stu[1]=sc.nextInt();
		System.out.print("영어>");
		stu[2]=sc.nextInt();
		System.out.print("수학>");
		stu[3]=sc.nextInt();
		stus.add(stu);
	}
	public void del(){
		
	}
	public void save(){
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			
			for(int i=0; i<stus.size(); i++){
				int[] stu = stus.get(i);
				fw.write(stu[0]+" ");
				fw.write(stu[1]+" ");
				fw.write(stu[2]+" ");
				fw.write(stu[3]+"\n");	
			}
//			fw.write("end");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void gameStart(){
		boolean result=true;
		while(result){
			System.out.print("1.보기 2.입력 3.삭제 4.저장 0.종료>");
			try{
			switch (sc.nextInt()) {
				case 0: result=false; break;
				case 1: show(); break;
				case 2: add(); break;
				case 3: del(); break;
				case 4: save(); break;
				default:
					System.out.println("메뉴의 범위는 0~4까지 입니다.");
				}
			}catch(Exception e){
				sc = new Scanner(System.in);
				System.out.println("숫자로 입력하세요");				
			}
		}
	}

	public static void main(String[] args) {
		// 성적관리 프로그램
		new Ex12();
		
	}

}











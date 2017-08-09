package com.hb.day12;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot=input("총인원>");
		int year=(input("해당년도>")-2000)*100;
		int menu=0;
		int cnt=0;
		int[][] stus=new int[tot][];
		while(true){
			menu=input("1.성적입력 2.성적출력 0.종료>");
			if(menu==0){break;
			}else if(menu==1){
//				stus[cnt]=new int[]{학번,국어,영어,수학};
				stus[cnt]=new int[4];
				stus[cnt][0]=year+cnt+1;
				stus[cnt][1]=input("국어>");
				stus[cnt][2]=input("영어>");
				stus[cnt][3]=input("수학>");
				cnt++;
			}else if(menu==2){
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-------------------------------------");
				for(int i=0; i<cnt; i++){
					for(int j=0; j<4; j++){
						System.out.print(stus[i][j]);
						System.out.print("\t");
					}
					System.out.println();
				}
				System.out.println("-------------------------------------");
			}
			
		}
		
		
	}
	static int input(String msg){
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
	}

}

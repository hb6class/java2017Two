package com.hb.day12;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot=input("���ο�>");
		int year=(input("�ش�⵵>")-2000)*100;
		int menu=0;
		int cnt=0;
		int[][] stus=new int[tot][];
		while(true){
			menu=input("1.�����Է� 2.������� 0.����>");
			if(menu==0){break;
			}else if(menu==1){
//				stus[cnt]=new int[]{�й�,����,����,����};
				stus[cnt]=new int[4];
				stus[cnt][0]=year+cnt+1;
				stus[cnt][1]=input("����>");
				stus[cnt][2]=input("����>");
				stus[cnt][3]=input("����>");
				cnt++;
			}else if(menu==2){
				System.out.println("�й�\t����\t����\t����");
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

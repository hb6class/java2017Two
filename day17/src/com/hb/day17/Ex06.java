package com.hb.day17;

import java.util.Scanner;

public class Ex06 {
	private static String[][] bbs=new String[0][2];

	public static void main(String[] args) {
		// BBS(�͸�Խ��� ver.0.0.1)
		// 1.�۸�� 2.�۾��� 3.�ۼ��� 4.�ۻ��� 0.����>1
		// --------------------------------------------
		// �۹�ȣ |	�� ��  |	�� �� 
		// --------------------------------------------
		// 1.�Է� ����ó��
		// 2. �����Ҵ�(+)
		// 3. ����, �����Ҵ�(-)
		
		System.out.println("BBS(�͸�Խ��� ver.0.0.1)");
		boolean tf=true;
		while(tf){
			System.out.print("1.�۸�� 2.�۾��� 3.�ۼ��� 4.�ۻ��� 0.����>");
			switch (menuInput()) {
			case 1:
				list();
				break;
			case 2:
				add();
				break;
			case 3:
				edit();
				break;
			case 4:
				del();
				break;
	
			default:
				tf=false;
				break;
			}
		}
		
		System.out.println("������ּż� �����մϴ�");
	}
	
	public static void list(){
		System.out.println("--------------------------------------------");
		System.out.println("�۹�ȣ\t|�� ��\t|�� �� ");
		System.out.println("--------------------------------------------");

		for(int i=0; i<bbs.length; i++){
			String[] temp=bbs[i];
			System.out.print(i+1);
			System.out.print("\t|");			
			System.out.print(temp[0]);		
			System.out.print("\t|");			
			System.out.println(temp[1]);		
		}
		
		System.out.println("--------------------------------------------");
	}
	
	public static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.print("����>");
		String msg1=sc.nextLine();
		System.out.print("����>");
		String msg2=sc.nextLine();
		String[] arr={msg1,msg2};
		String[][] temp=bbs;
		bbs=new String[bbs.length+1][2];
		for(int i=0; i<temp.length; i++){
			bbs[i]=temp[i];			
		}
		bbs[bbs.length-1]=arr;
	}
	
	public static void edit(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�۹�ȣ>");
		int idx=idxInput();
		String[] temp=bbs[idx-1];
		System.out.print("����>");
		temp[0]=sc.nextLine();
		System.out.print("����>");
		temp[1]=sc.nextLine();
	}
	
	public static void del(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�۹�ȣ>");
		int idx=idxInput();
		String[][] temp=bbs;
		bbs=new String[bbs.length-1][2];
		for(int i=0; i<idx-1; i++){
			bbs[i]=temp[i];
		}
		for(int i=idx; i<temp.length; i++){
			bbs[i-1]=temp[i];
		}
	}
	
	public static int suInput(){
		Scanner sc = new Scanner(System.in);
		int su=0;
		while(true){
			String msg = sc.nextLine();
			try{
				su=Integer.parseInt(msg);
			}catch(Exception ex){
				System.out.println("[ERR]�Է¿���");	
				continue;
			}
			break;
		}
		return su;
	}
	
	public static int idxInput(){
		int su=0;
		while(true){
			su=suInput();
			if(su<=bbs.length){break;}
			System.out.println("�׷��� ����");
		}
		return su;
	}
	
	public static int menuInput(){
		int su=0;
		while(true){
			su=suInput();
			if(su>-1&&su<5){break;}
			System.out.println("�޴��� 0~4 ������");
		}
		return su;
	}
}
















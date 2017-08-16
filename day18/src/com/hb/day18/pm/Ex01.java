package com.hb.day18.pm;

import java.util.Scanner;

public class Ex01 {
	private static Line[] bbs;
	static Scanner sc = new Scanner(System.in);

	static class Line{
		int idx;
		String sub;
		String cntnt;
		
		void setSub(String msg){
			if(msg.equals("")){
				sub="�������";
			}else{
				sub=msg;
			}
		}
		
		String content(){
			String msg=null;
			if(cntnt.length()>5){
				msg=cntnt.substring(0, 6)+"......";
			}else{
				msg=cntnt;
			}
			return msg;
		}
		
	}
	
	public static void main(String[] args) {
		// BBS(�͸�Խ��� ver.0.0.2)
		// 1.�۸�� 2.�۾��� 3.�ۼ��� 4.�ۻ��� 0.����>1
		// --------------------------------------------
		// �۹�ȣ |	�� ��  |	�� �� 
		// --------------------------------------------
		// 1.�Է� ����ó��
		// 2. �����Ҵ�(+)
		// 3. ����, �����Ҵ�(-)
		System.out.println("BBS(�͸�Խ��� ver.0.0.2)");
		boolean end=false;
		while(!end){
		System.out.print("1.�۸�� 2.�۾��� 3.�ۼ��� 4.�ۻ��� 0.����>");
		switch (menu()) {
		case 1:
			listShow();
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
		case 0:
			end=true;
			break;

		default:
			System.out.println("�Է��� 0~4������ ���ڸ� �Է¹ٶ�");
		}
		
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static void del(){
		if(bbs==null){
			System.out.println("���� �����ϴ�");
			return;
		}
		System.out.print("������ ��ȣ>");
		int num=menu()-1;
		if(num>bbs.length-1){
			System.out.println("������ ����� �����ϴ�");
			return;
		}
		
		Line[] temp=bbs;
		bbs=new Line[bbs.length-1];
		for(int i=0; i<num; i++){
			bbs[i]=temp[i];
		}
		for(int i=num+1; i<temp.length; i++){
//			temp[i].idx-=1;
			temp[i].idx=temp[i].idx-1;
			bbs[i-1]=temp[i];
		}
		
	}
	
	public static void edit(){
		if(bbs==null){
			System.out.println("�۾�� �����ȵ�");
			return;
		}
		Line line=null;
		while(true){
			System.out.print("������ ��ȣ>");
			try{
				int num=menu();
				line=bbs[num-1];
				}catch(Exception e){
					System.out.println("�׷��۾���(max="+bbs.length);
					continue;
				}
			break;
		}
		System.out.print("����>");
		line.sub=sc.next();
		System.out.print("����>");
		line.cntnt=sc.next();
	}
	
	public static void add(){
		sc=new Scanner(System.in);
		Line[] temp=null;
		if(bbs==null){
			temp=new Line[0];
			bbs=new Line[1];
		}else{
			temp=new Line[bbs.length];
			for(int i=0; i<temp.length;i++){
				temp[i]=bbs[i];
			}
			bbs=new Line[bbs.length+1];
		}
		bbs[bbs.length-1]=new Ex01.Line();
		for(int i=0; i<temp.length; i++){
			bbs[i]=temp[i];
		}
		System.out.print("����>");
//		bbs[bbs.length-1].sub=sc.nextLine();
		bbs[bbs.length-1].setSub(sc.nextLine());
		System.out.print("����>");
		bbs[bbs.length-1].cntnt=sc.nextLine();
		bbs[bbs.length-1].idx=bbs.length;
		listShow();
	}
	
	public static void listShow(){
		if(bbs==null){
			System.out.println("�۾���");
			return;
		}
		System.out.println("--------------------------------------------"
		 +"\n�۹�ȣ\t|�� ��\t|�� ��\t"
		 +"\n--------------------------------------------");
		for(int i=0; i<bbs.length; i++){
			System.out.print(bbs[i].idx);
			System.out.print("\t");
			System.out.print(bbs[i].sub);
			System.out.print("\t");
			System.out.println(bbs[i].content());
		}
		
	}
	
	public static int menu(){
		int su=-1;
			try{
				su=sc.nextInt();
			}catch(Exception e){
				sc=new Scanner(System.in);
			}
			return su;
	}

		
//		while(true){
//			try{
//				su=sc.nextInt();
//				break;
//			}catch(Exception e){
//				System.out.println("���ڸ� �Է¹ٶ�");
//			}
//		return su;
//		try{
//			return sc.nextInt();
//		}catch(Exception e){
//			System.out.println("���ڸ� �Է¹ٶ�");
//			return menu();
//		}

}















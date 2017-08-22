package com.hb.day17;

import java.util.Scanner;

public class Ex06 {
	private static String[][] bbs=new String[0][2];

	public static void main(String[] args) {
		// BBS(익명게시판 ver.0.0.1)
		// 1.글목록 2.글쓰기 3.글수정 4.글삭제 0.종료>1
		// --------------------------------------------
		// 글번호 |	제 목  |	내 용 
		// --------------------------------------------
		// 1.입력 제외처리
		// 2. 동적할당(+)
		// 3. 수정, 동적할당(-)
		
		System.out.println("BBS(익명게시판 ver.0.0.1)");
		boolean tf=true;
		while(tf){
			System.out.print("1.글목록 2.글쓰기 3.글수정 4.글삭제 0.종료>");
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
		
		System.out.println("사용해주셔서 감사합니다");
	}
	
	public static void list(){
		System.out.println("--------------------------------------------");
		System.out.println("글번호\t|제 목\t|내 용 ");
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
		System.out.print("제목>");
		String msg1=sc.nextLine();
		System.out.print("내용>");
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
		System.out.print("글번호>");
		int idx=idxInput();
		String[] temp=bbs[idx-1];
		System.out.print("제목>");
		temp[0]=sc.nextLine();
		System.out.print("내용>");
		temp[1]=sc.nextLine();
	}
	
	public static void del(){
		Scanner sc = new Scanner(System.in);
		System.out.print("글번호>");
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
				System.out.println("[ERR]입력오류");	
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
			System.out.println("그런글 없음");
		}
		return su;
	}
	
	public static int menuInput(){
		int su=0;
		while(true){
			su=suInput();
			if(su>-1&&su<5){break;}
			System.out.println("메뉴는 0~4 사이임");
		}
		return su;
	}
}
















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
				sub="제목없음";
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
		// BBS(익명게시판 ver.0.0.2)
		// 1.글목록 2.글쓰기 3.글수정 4.글삭제 0.종료>1
		// --------------------------------------------
		// 글번호 |	제 목  |	내 용 
		// --------------------------------------------
		// 1.입력 제외처리
		// 2. 동적할당(+)
		// 3. 수정, 동적할당(-)
		System.out.println("BBS(익명게시판 ver.0.0.2)");
		boolean end=false;
		while(!end){
		System.out.print("1.글목록 2.글쓰기 3.글수정 4.글삭제 0.종료>");
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
			System.out.println("입력은 0~4까지의 숫자만 입력바람");
		}
		
		}
		System.out.println("이용해주셔서 감사합니다");
	}
	
	public static void del(){
		if(bbs==null){
			System.out.println("글이 없습니다");
			return;
		}
		System.out.print("삭제할 번호>");
		int num=menu()-1;
		if(num>bbs.length-1){
			System.out.println("삭제할 대상이 없습니다");
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
			System.out.println("글없어서 수정안됨");
			return;
		}
		Line line=null;
		while(true){
			System.out.print("수정할 번호>");
			try{
				int num=menu();
				line=bbs[num-1];
				}catch(Exception e){
					System.out.println("그런글없음(max="+bbs.length);
					continue;
				}
			break;
		}
		System.out.print("제목>");
		line.sub=sc.next();
		System.out.print("내용>");
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
		System.out.print("제목>");
//		bbs[bbs.length-1].sub=sc.nextLine();
		bbs[bbs.length-1].setSub(sc.nextLine());
		System.out.print("내용>");
		bbs[bbs.length-1].cntnt=sc.nextLine();
		bbs[bbs.length-1].idx=bbs.length;
		listShow();
	}
	
	public static void listShow(){
		if(bbs==null){
			System.out.println("글없음");
			return;
		}
		System.out.println("--------------------------------------------"
		 +"\n글번호\t|제 목\t|내 용\t"
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
//				System.out.println("숫자만 입력바람");
//			}
//		return su;
//		try{
//			return sc.nextInt();
//		}catch(Exception e){
//			System.out.println("숫자만 입력바람");
//			return menu();
//		}

}















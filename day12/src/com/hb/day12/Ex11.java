package com.hb.day12;

public class Ex11 {

	public static void main(String[] args) {
		// String
		String msg1="Java Web Spring";
		// Q1.�빮�ڰ� � �����ϴ���
		//		ī��Ʈ�Ͻÿ�
		//
		int cnt=0;
		char tmp=' ';
		
		for(int i=0; i<msg1.length(); i++){
			tmp=msg1.charAt(i);
			if((int)tmp>=(int)'A'&&(int)tmp<=(int)'Z'){
				cnt++;
			}
		}
		System.out.println("msg1�� �빮�ڴ� "+cnt+"���Դϴ�");
		
		// Q2.toUpperCase()�� ������� ����
		// �빮�ڷ� ��ȯ�Ͻÿ�
		//
		String[] st=new String[3];
		for(int i=0; i<msg1.length(); i++){
			tmp=msg1.charAt(i);
			if((int)tmp>(int)'a'-1){
				st[0]=msg1.substring(0, i);// --> J
				st[1]=""+(char)(tmp-('a'-'A'));//--> A
				if(msg1.length()!=i){// --> va~~~~
					st[2]=msg1.substring(i+1);
				}else{
					st[2]="";
				}
				msg1=st[0]+st[1]+st[2];
			}
		}
		System.out.println(msg1);
		
		// Q3.����� �߶� String[]�� �����ÿ�
		// 
		msg1=msg1.trim();
		//
		cnt=0;
		char ch2=' ';
		for(int i=0; i<msg1.length(); i++){
			if(msg1.charAt(i)==' '){
				cnt++;
			}
		}
		String[] str=new String[cnt+1];
		int[] space=new int[cnt];
		int su=0;
		for(int i=0; i<msg1.length(); i++){
			if(msg1.charAt(i)==' '){
				space[su++]=i;
			}
		}
		// {4,8};
		// substring(0,4)
		// substring(5,8)
		// substring(9,?)
		
		for(int i=0; i<str.length; i++){
			if(i==0){str[0]=msg1.substring(0,space[0]);}
			else if(i==str.length-1){str[i]=msg1.substring(space[i-1]+1);}
			else{str[i]=msg1.substring(space[i-1]+1,space[i]);}
//			str[1]=msg1.substring(space[0]+1,space[1]);
//			str[2]=msg1.substring(space[1]+1,space[2]);
		}
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}
		
		// 04.�ֹι�ȣ�� �Է����ּ���
		// >>>990101-1234567
		// ����� ��� ���� �Դϴ�
		// >>>99010112345671
		// -�� �������� ������
		// >>>990101-123456
		// �ֹι�ȣ������ 000000-0000000�Դϴ�
		
		

	}

}

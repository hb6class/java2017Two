package com.hb.day17;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1=null;
		st1="";
		st1=new String();
		
		st1=new String("java");
//		char[] arr={'j','a','v','a'};
//		char[] arr={'j','a',' ','v','a'};
//		st1=new String(arr);
//		arr=st1.toCharArray();
//		arr=new char[st1.length()];
//		for(int i=0; i<arr.length; i++){
//			arr[i]=st1.charAt(i);
//		}
		char[] arr2=st1.toCharArray();
		char[] arr3=new char[arr2.length+1];
//		for(int i=0; i<2; i++){
//			arr3[i]=arr2[i];
//		}
		System.arraycopy(arr2, 0, arr3, 0, 2);
		arr3[2]=' ';
		System.arraycopy(arr2, 2, arr3, 3, 2);
//		for(int i=2; i<arr2.length; i++){
//			arr3[i+1]=arr2[i];
//		}
		System.out.println(new String(arr3));
		String msg="java frameWork";
//		String msg2="java";
//		String msg3="frameWork";
		char[] arrs=msg.toCharArray();
		int idx=0;
		for(idx=0; idx<arrs.length; idx++){
		 	if(Character.isWhitespace(arrs[idx])){
		 		break;
		 	}
		}
		String msg2=new String(arrs,0,idx);
		String msg3=new String(arrs,idx+1,msg.length()-idx-1);
		System.out.println(msg2);
		System.out.println(msg3);
		byte[] arr5={'J',65,'V',65};
		System.out.println(new String(arr5));
		String msg6="java"+"FrameWork";
		System.out.println(msg6);
		String msg7="java".concat(" FrameWork");
		System.out.println(msg7);
		System.out.println(msg7.indexOf('z'));
		System.out.println(msg7.indexOf("Fra"));
		String msg8=msg7.substring(0, msg7.indexOf(' '));
		String msg9=msg7.substring(msg7.indexOf(' ')+1, msg7.length());
		System.out.println(msg8);
		System.out.println(msg9);
		String msg10 ="     ja VA    ";
		System.out.println(msg10.trim()+"*********");
		System.out.println(msg10.toUpperCase());
		System.out.println(msg10.toLowerCase());
		msg10="javaWeb";
		System.out.println(msg10.replace('j', 'J'));
		System.out.println(msg10);
		System.out.println(msg10.replace("Web", "Framework"));
		System.out.println(msg10.replace("Web", ""));
		System.out.println(msg10.replace("Web", "WebFramework"));
		System.out.println(msg10.compareTo("javaWea"));
//		"javaWeb"-"java"
		System.out.println(msg10.equals("java"));
	}

}










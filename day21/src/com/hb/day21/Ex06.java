package com.hb.day21;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Java   Database Web Framework Android";
		String[] msgs=null;
		
		int cnt=0;
		
		char[] ch=msg.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i]==' '){
				cnt++;
			}
		}
		int idx=0;
		int temp;
		msgs=new String[cnt+1];
		
//		for(int i=0; i<msgs.length; i++){
//			temp=idx;
//			idx=msg.indexOf(',', temp+1);
//			if(i==msgs.length-1){
//				msgs[i]=msg.substring(temp+1);
//			}else if(i==0){
//				msgs[i]=msg.substring(temp,idx);
//			}else{
//				msgs[i]=msg.substring(temp+1,idx);
//			}
//		}
//		temp=idx;
//		idx=msg.indexOf(',',0);
//		msgs[0]=msg.substring(temp+1,idx);
//		temp=idx;
//		idx=msg.indexOf(',', temp+1);
//		msgs[1]=msg.substring(temp+1,idx);
//		temp=idx;
//		idx=msg.indexOf(',', temp+1);
//		msgs[2]=msg.substring(temp+1, idx);
//		temp=idx;
//		idx=msg.indexOf(',', temp+1);
//		msgs[3]=msg.substring(temp+1);
		
		msgs[0]=msg;
		for(int i=0; i<cnt; i++){
			idx=msgs[i].indexOf(" ");
			msgs[i+1]=msgs[i].substring(idx+1);
			msgs[i]=msgs[i].substring(0, idx);
		}
//		idx=msgs[0].indexOf(",");
//		msgs[1]=msgs[0].substring(idx+1);
//		msgs[0]=msgs[0].substring(0, idx);
//		
//		idx=msgs[1].indexOf(",");
//		msgs[2]=msgs[1].substring(idx+1);
//		msgs[1]=msgs[1].substring(0, idx);
//
//		idx=msgs[2].indexOf(",");
//		msgs[3]=msgs[2].substring(idx+1);
//		msgs[2]=msgs[2].substring(0, idx);
		
		
//		msgs=new String[]{"Java","Database","Web","Framework"};
		for(String tmp : msgs){
			System.out.println(tmp);
		}
	}

}

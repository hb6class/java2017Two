package com.hb.day18.pm;


class MyLink{
	static int size;
	Node start;
	
	class Node{
		int val;
		Node node;
	}
	
	int get(int idx){
		int su=0;
		Node tmp=start;
		for(int i=0; i<idx; i++){tmp=tmp.node;}
		su=tmp.val;
		return su;
	}
	
	void add(int a){size++;
		if(start==null){
			start=new Node();
			start.val=a;
		}else{
			Node nxt=start;
			while(true){
				if(nxt.node==null){
					break;
				}
				nxt=nxt.node;
			}
			nxt.node=new Node();
			nxt.node.val=a;
		}
			//2
//			start.node=new Node();
//			start.node.val=a;
			//3
//			start.node.node=new Node();
//			start.node.node.val=a;
			//4
//			start.node.node.node=new Node();
//			start.node.node.node.val=a;
	}
	
	
}





public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLink list = new MyLink();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		for(int i=0; i<list.size; i++){
			System.out.println(list.get(i));
		}
	}

}

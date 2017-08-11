package com.hb.day15;

class Bbs{
	
}

interface Lec05{
	
	Bbs[] bbsList();
	Bbs bbsDetail(int idx);
	void add();
	void edit();
	void delete();
}

interface Ελ½Ε{}

public class Ex05 extends Object implements Lec05 {

	public static void main(String[] args) {
		Lec05 me = new Ex05();
	}

	@Override
	public Bbs[] bbsList() {
		Bbs[] bbs= new Bbs[10];
		for(int i=0; i<bbs.length; i++){
			bbs[i]=new Bbs();
		}
		return bbs;
	}

	@Override
	public Bbs bbsDetail(int idx) {
		Bbs[] bbs=bbsList();
		
		return bbs[idx];
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}

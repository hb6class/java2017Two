package com.hb.day17;

import java.util.Scanner;

import com.hb.ex.Machine;

class Tv implements Machine{
	@Override
	public void on() {
		System.out.println("tv�� �Ѱ�");
	}

	@Override
	public void off() {
		System.out.println("tv�� ����");
	}
}

class Radio implements Machine{
	@Override
	public void on() {
		System.out.println("������ �Ѱ�");
	}

	@Override
	public void off() {
		System.out.println("������ ����");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1.TV 2.���� 3.�����>");
		Machine remote=null;
		switch (sc.nextLine()) {
		case "1":
			remote=new Tv();
			
			break;
		case "2":
			remote=new Radio();
			
			break;
		case "3":
			remote=new Machine(){

				@Override
				public void on() {
					System.out.println("����� �Ѱ�");
				}

				@Override
				public void off() {
					System.out.println("����� ����");
				}
				
			};
			
			break;

		default:
			break;
		}
		remote.on();
		remote.off();
	}

}

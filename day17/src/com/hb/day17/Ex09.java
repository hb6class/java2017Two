package com.hb.day17;

import java.util.Scanner;

import com.hb.ex.Machine;

class Tv implements Machine{
	@Override
	public void on() {
		System.out.println("tv를 켜고");
	}

	@Override
	public void off() {
		System.out.println("tv를 끄다");
	}
}

class Radio implements Machine{
	@Override
	public void on() {
		System.out.println("라디오를 켜고");
	}

	@Override
	public void off() {
		System.out.println("라디오를 끄다");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1.TV 2.라디오 3.오디오>");
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
					System.out.println("오디오 켜고");
				}

				@Override
				public void off() {
					System.out.println("오디오 끄다");
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

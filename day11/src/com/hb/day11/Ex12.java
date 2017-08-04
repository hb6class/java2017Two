package com.hb.day11;

class Ball{
	int num;
	boolean chk;
	String color;
	
	public Ball(int a) {
		num=a;
		chk=false;
		switch ((a-1)/10) {
		case 0:
			color="����";
			break;
		case 1:
			color="�Ķ�";
			break;
		case 2:
			color="���";
			break;

		default:
			color="����";
			break;
		}
	}
}

public class Ex12 {

	public static void main(String[] args) {
		// �ζ�
		Ball[] box = new Ball[45]; 
		Ball[] result=new Ball[6];
		int ran=0;
		for(int i=0; i<box.length; i++){
			box[i]=new Ball(i+1);
		}
		
		for(int i=0; i<6; i++){
			// box�� index �̱⿡ 0 ~ 44
			ran=(int)(Math.random()*45);
			if(box[ran].chk){
				// �ٽ� �̱�
				i--;
				continue;
			}else{
				// �̾����� ��ŷ
				box[ran].chk=true;
			}
			result[i]=box[ran];
		}
		show(result);
	}

	public static void show(Ball[] result){
		for(int i=0; i<result.length; i++){
			if(i==0){System.out.print("��÷��ȣ�� ");}
			System.out.print(result[i].color+"�� �� ");
			System.out.print(result[i].num+"��");
			if(i==result.length-1){
				System.out.println("�Դϴ�");
				System.out.println("�����մϴ�");
			}else{
				System.out.print("\n,");
			}
		}
	}
}














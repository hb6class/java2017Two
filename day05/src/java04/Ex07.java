package java04;

import java.util.Scanner;

public class Ex07 {
	
	public static int sum(int kor, int eng, int math){
		//����
		return kor+eng+math;
	}
	
	public static double avg(int kor,int eng, int math){
		double avg=sum(kor,eng,math)*100/3/100.0;
		return avg;
	}
	
	public static void result(double avg){
		int su=(int)(avg/10);
		switch (su) {
		case 10:
		case 9:
			System.out.println("A�����Դϴ�");
			break;
		case 8:
			System.out.println("B�����Դϴ�");			
			break;
		case 7:
			System.out.println("C�����Դϴ�");			
			break;
		case 6:
			System.out.println("D�����Դϴ�");			
			break;
		default:
			System.out.println("F�����Դϴ�");			
			break;
		}
	}

	public static void main(String[] args) {
		// �����������α׷�
		// ����(���� ���� ����)
		// ���� ��� 
		// �л���=???
		// ���� 
		Scanner sc=new Scanner(System.in);
		String input="";
		int kor=0;
		int eng=0;
		int math=0;
		
		while(true){
		System.out.print("����:");
		input=sc.nextLine();
		kor=Integer.parseInt(input);
		System.out.print("����:");
		input=sc.nextLine();
		eng=Integer.parseInt(input);
		System.out.print("����:");
		input=sc.nextLine();
		math=Integer.parseInt(input);
		double avg=avg(kor,eng,math);
		
		System.out.print("����:"+kor);
		System.out.print(",����:"+eng);
		System.out.print(",����:"+math);
		System.out.print(",����:"+sum(kor,eng,math));
		System.out.print(",���:"+avg);
		result(avg);
		
		if(input()==0){break;}
		
		}
	}
	
	public static int input(){
		Scanner sc=new Scanner(System.in);
		int su=0;
		while(true){
			System.out.print("1.��� 0.����>");
			String input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0 || su==1){
				break;
			}else{
				System.out.println("�Է��� 1�Ǵ�0���� ���ּ���");
			}
		}
		return su;
	}

}








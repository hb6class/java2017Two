package java04;

import java.util.Scanner;

// ��������Ʈ
// 1 �� | I ��
//0o��

public class Ex06 {

	public static void main(String[] args) {
		// �л� �������� ���α׷�(ver 0.0.2)
		// ���� ���� ���� ������ �Է¹ް�
		// ����, ���, ������ ���ϴ� ���α׷��� 
		// �ۼ��Ͻÿ�
		// ����� �Ҽ� ��° �ڸ����� �Դϴ�.
		// ��, ���α׷� ���� �������� ���
		// ���(1), ����(0)>0
		Scanner sc = new Scanner(System.in);
		String temp="";
		char credit='F';
		int input=0;
		while(true){
			student();
			
			System.out.print("���(1), ����(0)>");
			temp=sc.nextLine();
			input=Integer.parseInt(temp);
			if(input==0){
				break;
			}
		}
		System.out.println("������ּż� �����մϴ�");
	}
	
	public static void student(){
		
		int kor, eng, math;
		kor=0;eng=0;math=0;
		
		kor=inputSu("����:");
		eng=inputSu("����:");
		math=inputSu("����:");
		
		
		System.out.print("����:"+kor);
		System.out.print(",����:"+eng);
		System.out.print(",����:"+math);
		
		
		System.out.print(",�հ�:"+sum(kor,eng,math));
		
		System.out.print(",���:"+avg(kor,eng,math));
		
		switch (func01(kor,eng,math)) {
		case 10:
		case 9:
			show('A');
			break;
		case 8:
			show('B');
			break;
		case 7:
			show('C');
			break;
		case 6:
			show('D');
			break;

		default:
			show('F');
		}
	}
	
	public static int inputSu(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String temp=sc.nextLine();
		return Integer.parseInt(temp);
	}
	
	public static void show(char credit){
		System.out.println(credit+"����");		
	}
	
	public static int sum(int kor, int eng, int math){
		
		return (kor+eng+math);
	}
	
	public static double avg(int kor, int eng, int math){
		return ((kor+eng+math)*100/3/100.0);
	}
	
	public static int func01(int kor, int eng, int math){
		int result=(kor+eng+math)*100/3/1000;
		return result;
	}

}












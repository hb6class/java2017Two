package com.hb.day07;

public class Ex06 {

	public static void main(String[] args) {
		// �л��������� �հ� ��� ����
		int kor=60;
		int eng=70;
		int math=80;
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		System.out.println("����\t����\t����\t�հ�\t���\t����");
		System.out.print(kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
		System.out.print("\t");
		
		if(avg>=90){
			System.out.println("A����");
		}else if(avg>=80){
			System.out.println("B����");
		}else if(avg>=70){
			System.out.println("C����");
		}else if(avg>=60){
			System.out.println("D����");			
		}else{
			System.out.println("F����");			
		}
		
		
		
		
		System.out.println("-------------------------------");
		System.out.println("������");
		System.out.println("-------------------------------");
		
		System.out.println("��ǰ��\t\t����\t����\t�հ�");
		System.out.println("�������\t1000\t1\t"+(1000*1));
		System.out.println("����\t\t500\t2\t"+(500*2));
		System.out.println("��\t\t300\t3\t"+(300*3));
		System.out.println("-------------------------------");
		
		
	}

}







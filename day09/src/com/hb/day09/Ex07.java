package com.hb.day09;

public class Ex07 {
	//
	//�Ӽ� ~ �ܾ�
	//��� ~ ����
	//
	static int num;
	int kor;
	int eng;
	int math;
	
	Ex07(int a, int b, int c){
		kor=a;
		eng=b;
		math=c;
		num++;
	}
	Ex07(int d, int a, int b, int c){
		num=d;
		kor=a;
		eng=b;
		math=c;
	}
	
	int sum(){
		return kor+eng+math;
	}
	
	double avg(){
		return sum()*100/3/100.0;
	}
	
	static int input(String name){
		java.io.InputStream inn = System.in;
		java.util.Scanner sc = new java.util.Scanner(inn);
		System.out.print(name+">");
		String msg=sc.nextLine();
		int su=Integer.parseInt(msg);
		return su;
	}

	public static void main(String[] args) {
		// �л� �������� ���α׷�(ver 0.2.1)
		Ex07 stu;
		boolean one=true;
		while(true){
			if(one){
				stu = new Ex07(input("�й�"),input("����")
						, input("����"), input("����"));
				one=false;
			}else{
				stu = new Ex07(input("����"), input("����")
						, input("����"));
			}
		System.out.println("------------------------------------");
		System.out.println("�й�\t����\t����\t����\t�հ�\t���");
		System.out.println("------------------------------------");
		System.out.print(stu.num);
		System.out.print("\t");
		System.out.print(stu.kor);
		System.out.print("\t");
		System.out.print(stu.eng);
		System.out.print("\t");
		System.out.print(stu.math);
		System.out.print("\t");
		System.out.print(stu.sum());
		System.out.print("\t");
		System.out.println(stu.avg());
		System.out.println("------------------------------------");
		int su = input("1.��� 0.����");
			if(su==0){
				break;
			}
		}
		
		
	}

}










class Ex14{
	public static void main(String[] args){
		//02. �л� �������� ���α׷�(ver 0.0.1)
		//	����=68
		//	����=75
		//	����=91
		// 	���հ� ���(�Ҽ���°�ڸ�)�� ���Ͻÿ�
		// ����=69,����=75,����=91, ����=???,���=??.??
		int kor=69;
		int eng=75;
		int math=91;
		int sum=kor+eng+math;
		double avg=sum*100/3/100.0;
		System.out.print("����="+kor);
		System.out.print(",����="+eng);
		System.out.print(",����="+math);
		System.out.print(",����="+sum);
		System.out.println(",���="+avg);







		//03. ��� 90���̻� A
		//		80���̻� B
		//		70���̻� C
		//		60���̻� D
		//		60���̸� F	
		//	�л� ������ ���Ͻÿ�(switch�� �̿�)

		switch((int)avg/10){
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

		}

	}

}
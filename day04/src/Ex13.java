class Ex13{
	public static void main(String[] args){
		// ���ǹ� switch��
		/* 
		switch(��){
			case ��:
				���๮;
				break;
			case ��:
				���๮;
				break;
			case ��:
				���๮;
				break;
			~~~~~~~~~~~~~~~
			default:
				���๮;
		}
		*/

		switch(2+3){
			case 4:
			System.out.println("���Դϴ�");
			//break;
			case 5:
			System.out.println("���Դϴ�");
			//break;
			case 6:
			System.out.println("���Դϴ�");
			//break;
			default:
			System.out.println("4~6�� �ƴմϴ�");
			break;
		}
		//Q1. n=7 ¦������ Ȧ������ ���
		//

		int n=102;
		String msg="";
		switch(n%2){
			case 1: 
				msg="Ȧ";
				break;
			case 0: msg="¦";break;

		}
		System.out.println("n="+n+"�� "+msg+"�� �Դϴ�");

		//02. �л� �������� ���α׷�
		//	����=68
		//	����=75
		//	����=91
		// 	���հ� ���(�Ҽ���°�ڸ�)�� ���Ͻÿ�
		// ����=68,����=75,����=91, ����=???,���=??.??
		//
		//03. ��� 90���̻� A
		//		80���̻� B
		//		70���̻� C
		//		60���̻� D
		//		60���̸� F	
		//	�л� ������ ���Ͻÿ�(switch�� �̿�)	
	}

}
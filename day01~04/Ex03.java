class Ex03{
	public static void main(String[] args){
		//�ּ� - �ҽ��� �ޱ�, �����ϻ󿡼� ����
		//System.out.println("�߳��Ͷ�");
		//10���� ����
		//int a;	//10���� ��������a���� int 4����Ʈ
		//a=100;	//a�� 10�� �Ҵ�(�ʱ�ȭ-�����Ҵ�)
		//System.out.println(a);
		byte b;	//1����Ʈ -128~127
		byte c;
		byte d;
		b=0;
		c=b++;	// b=b+1;
		d=++b;	// b=b+1;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		short e; // 10���� ���� 
		e=32767;
		e++;
		System.out.println(e);
		int g;
		g=9223372036854775807L;
		System.out.println(g);
	}
}
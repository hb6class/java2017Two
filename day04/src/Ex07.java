class Ex07{	//
	public static void main(String[] args){	// 

		// ��� (if���ǹ�)
		// ���� ~~�̶�� ~~~�ض�
		// if(����){(~~�ض�)���๮}
		// if(����){���๮;}else{���๮;}
		// if(����1){}else if(����2){}else if(����3){....}
		// if(����1){}else if(����2){}else if(����3){....}else{}
		
		int a=2;	// 10���� ������ ���� a�� 2
		if(a>=0){	// ���� a�� 0���� ũ�ų� ���ٸ�
			System.out.println("����Դϴ�");	// �ܼ�â�� ����Դϴٶ�� ����ϼ���
		}
		if(a<0){
			System.out.println("�����Դϴ�");
		}
		//Q1) n=2253�Դϴ�
		// n�� 3�� ����̸鼭 ¦������ �׷��� ������
		int n=2253;
		/*
		if(n%3==0&&n%2==0){
			System.out.println("3�ǹ���̸� ¦���Դϴ�");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
		if(n%3==0){
			if(n%2==0){}else{}
		}else{

		}
		*/
		//Q2) m=435 �Դϴ� 5�� ���������� �������� ���Դϱ�?
		// ��� "5�� ������ �������ϴ�"
		// ��� "�������� 1�Դϴ�"
		// ��� "�������� 2�Դϴ�"
		// ��� "�������� 3�Դϴ�"
		// ��� "�������� 4�Դϴ�"
		int m=435;
		if(m%5<1){
			System.out.println("5�� ������ �������ϴ�");
		}else if(m%5<2){
			System.out.println("�������� 1�Դϴ�");
		}else if(m%5<3){
			System.out.println("�������� 2�Դϴ�");
		}else if(m%5<4){
			System.out.println("�������� 3�Դϴ�");
		}else{
			System.out.println("�������� 4�Դϴ�");
		}
		//Q3) x=5, y=7, z=3;
		// ������������ ����ϼ���
		/*
		if(x<y && x<z && y<z){
		// x<y<z // x<y && x<z && y<z
		System.out.println(x+"<"+y+"<"+z);
		}else if(x<y && x<z && z<y){
		// x<z<y
		System.out.println(x+"<"+z+"<"+y);
		}else if(y<x && y<z &&x<z){
		// y<x<z
		System.out.println(y+"<"+x+"<"+z);
		}else if(y<x && y<z &&z<x){
		System.out.println(y+"<"+z+"<"+x);
		}else if(z<x && z<y && x<y){
		System.out.println(z+"<"+x+"<"+y);
		}else{
		System.out.println(z+"<"+y+"<"+x);
		}
		*/
		int x, y, z;
		x=5;
		y=7;
		z=3;
		
			
			if(x<y && x<z&&y<z){
			System.out.print(x+"<"+y+"<"+z);
			}else if(x<y && x<z&&z<y){
			System.out.print(x+"<"+z+"<"+y);
			}else if(y<x && y<z&&x<z){
			System.out.print(y+"<"+x+"<"+z);
			}else if(y<x && y<z&&z<x){
			System.out.print(y+"<"+z+"<"+x);
			}else if(z<x && z<y&&x<y){
			System.out.print(z+"<"+x+"<"+y);
			}else if(z<x && z<y&&y<x){
			System.out.print(z+"<"+y+"<"+x);
			}
			



		//Q4) ���� ������������ �����ϼ���
		//����� ������ x<y<z������ ���
		// x=?, y=?, z=?
			int tmp=0;
			int tmp2=0;
			/*
			if(x<y && x<z&&y<z){
			
			}else if(x<y && x<z&&z<y){
				tmp=y;
				y=z;	
				z=tmp;
			}else if(y<x && y<z&&x<z){
				tmp=x;
				x=y;
				y=tmp;
			}else if(y<x && y<z&&z<x){
				tmp=x;
				x=y;
				y=z;
				z=tmp;
			}else if(z<x && z<y&&x<y){
				tmp=x;
				tmp2=y;
				x=z;
				y=tmp;
				z=tmp2;
			}else if(z<x && z<y&&y<x){
				tmp=x;
				x=z;
				z=tmp;
			}
			*/

			if(x<y&&x<z){
				if(z<y){
				tmp=y;
				y=z;	
				z=tmp;
				}
			}else if(y<x&&y<z){
				tmp=x;
				x=y;
				if(tmp<z){
				y=tmp;
				}else{
				y=z;
				z=tmp;
				}
			}else{
				tmp=x;
				x=z;
				if(tmp<y){
				z=y;
				y=tmp;
				}else{
				z=tmp;
				}
			}
			System.out.println(x+"<"+y+"<"+z);

	}


}









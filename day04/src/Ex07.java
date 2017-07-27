class Ex07{	//
	public static void main(String[] args){	// 

		// 제어문 (if조건문)
		// 만약 ~~이라면 ~~~해라
		// if(조건){(~~해라)실행문}
		// if(조건){실행문;}else{실행문;}
		// if(조건1){}else if(조건2){}else if(조건3){....}
		// if(조건1){}else if(조건2){}else if(조건3){....}else{}
		
		int a=2;	// 10진수 정수형 변수 a는 2
		if(a>=0){	// 만약 a가 0보다 크거나 같다면
			System.out.println("양수입니다");	// 콘솔창에 양수입니다라고 출력하세요
		}
		if(a<0){
			System.out.println("음수입니다");
		}
		//Q1) n=2253입니다
		// n이 3의 배수이면서 짝수인지 그렇지 않은지
		int n=2253;
		/*
		if(n%3==0&&n%2==0){
			System.out.println("3의배수이며 짝수입니다");
		}else{
			System.out.println("조건을 만족하지 않습니다");
		}
		
		if(n%3==0){
			if(n%2==0){}else{}
		}else{

		}
		*/
		//Q2) m=435 입니다 5로 나누었을때 나머지는 얼마입니까?
		// 결과 "5로 나누어 떨어집니다"
		// 결과 "나머지는 1입니다"
		// 결과 "나머지는 2입니다"
		// 결과 "나머지는 3입니다"
		// 결과 "나머지는 4입니다"
		int m=435;
		if(m%5<1){
			System.out.println("5로 나누어 떨어집니다");
		}else if(m%5<2){
			System.out.println("나머지는 1입니다");
		}else if(m%5<3){
			System.out.println("나머지는 2입니다");
		}else if(m%5<4){
			System.out.println("나머지는 3입니다");
		}else{
			System.out.println("나머지는 4입니다");
		}
		//Q3) x=5, y=7, z=3;
		// 오름차순으로 출력하세요
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
			



		//Q4) 위를 오름차순으로 정렬하세요
		//출력은 무조건 x<y<z순으로 출력
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









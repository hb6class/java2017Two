class Ex11{
public static void main(String[] args){
	// Q5. 
	// 1 2 3
	// 4 5 6
	// 7 8 9
	
	int a=1;
	while(a<10){
	System.out.print(a+" ");
	if(a%3==0){
	System.out.println();
	}
	a++;
	}
	System.out.println("\n---------------------------\n");
	int tmp=1;
	for(int c=0; c<3; c++){
	//tmp=1+c*3;
	for(int b=tmp; b<=tmp+2; b++){
		System.out.print(b+" ");
	}
	tmp+=3;
	System.out.println();
	}
	System.out.println("\n---------------------------\n");
	//Q4.
	
	//1~(m+1)
	/////////////////////////
	// 1
	// 2 3
	// 3 4 5
	// 4 5 6 7
	int tmp2=0;
	for(int m=0; m<4; m++){
		for(int n=1+m; n<=(m+1)+m; n++){
		System.out.print((char)(n+64) + "\t");
		}
		System.out.println();
	}

	System.out.println("\n---------------------------\n");
	
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	// 'A'==65;
	tmp2=0;
	for(int m=0; m<4; m++){
		tmp2+=m;
		for(int n=1+tmp2; n<=(m+1)+tmp2; n++){
		System.out.print((char)(n+64) + "\t");
		}
		System.out.println();
	}

	System.out.println("\n---------------------------\n");
	
	for(int h=1; h<11; h++){
		System.out.print(h);
	}



	/*
	int tmp3=0;
	int tmp2=0;
	for(int y=1; y<5; y++){
		for(int x=1; x<=y; x++){
		tmp3=x+tmp2;
		System.out.print(tmp3+" ");
		}
		tmp2=tmp3;
	System.out.println();
	}
	*/
}


}







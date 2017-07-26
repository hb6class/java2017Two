class Ex10{
public static void main(String[] args){
	//Q3.
	//	』 』 』 』 』 
	//	』 』 』 』 』 
	//	』 』 』 』 』 
	//	』 』 』 』 』 
	//	』 』 』 』 』 

	String star="』 ";

	for(int i=0; i<25; i++){
		if(i%5==0){
		System.out.println();
		}
		System.out.print(star);
	}
	//////////////////////////////////
	System.out.println("\n------------------------------");
for(int a=0; a<5; a++){
	for(int b=0; b<5; b++){
	System.out.print(star);
	}
	System.out.println();
}
	//////////////////////////////////
	System.out.println("\n------------------------------");
	int x=0;
	int y=0;
	while(y<5){
		x=0;
		while(x<5){
			System.out.print(star);
		x++;
		}
	System.out.println();
	y++;
	}

}

}







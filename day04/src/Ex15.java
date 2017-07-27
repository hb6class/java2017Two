class Ex15{
	public static void main(String[] args){
		int a=1;
		
		while(a<11){
			
			if(a%2!=0){
				a++;
				continue;
			}
			
			System.out.println("a="+a);
			
			a++;
		}


	}

}
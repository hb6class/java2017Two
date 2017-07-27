package java04;

public class Ex02 {

	public static void main(String[] args){
		System.out.println("main start");
		
		int a,b,c,d;

		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=0;
		
		if(c==1){
			d=hap(a,b);
		}else if(c==2){
			d=cha(a,b);
		}
		System.out.println("°á°ú´Â"+d);
		System.out.println("main end");
	}

	public static int hap(int x, int y){
		int result=x+y;
		//System.out.println(x+"+"+y+"="+result);
		return result;
	}

	public static int cha(int x, int y){
		int result=x-y;
		//System.out.println(x+"-"+y+"="+result);
		return result;
	}
}
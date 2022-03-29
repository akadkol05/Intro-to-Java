package gettingStartedWithJava;

public class Sum_Even_odd {

	public static void main(String[] args) {
		int a=1234;
		int sum_e=0;
		int sum_o=0;
		
		for(;a!=0;a/=10) {
		
			int num=a%10;
			if(num%2==0) sum_e=num+sum_e;
		    else sum_o=num+sum_o;
		
		}
		
		
		System.out.println(sum_e +" "+sum_o);
		
		

	}
	
}

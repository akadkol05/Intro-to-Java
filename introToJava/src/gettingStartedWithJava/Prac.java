package gettingStartedWithJava;

public class Prac {

	public static void main(String[] args) {
		int a=11234;
		int sume=0;
		int sumo=0;
		while(a!=0) {
		   int num=a%10;
		   if(num%2==0) {
			   sume=sume+num;
		   }else {
			   sumo=sumo=sumo+num;
		   }
		   a=a/10;
		}
		System.out.println(sume+" "+sumo);

	}

}

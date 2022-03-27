package gettingStartedWithJava;

public class DecimalToBinary {
	public static void rev(int n) {
		int rev=0;
		while(n!=0) {
			int num=n%10;
			rev=rev*10+num;
			n/=10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		int n=13;
		int ans=0;
		while(n!=0) {
			int r=n%2;
			n/=2;
			ans=ans*10+r;
			
		}
		rev(ans);
		

	}

}

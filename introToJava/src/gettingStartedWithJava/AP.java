package gettingStartedWithJava;

public class AP {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			int ap=3*i+2;
			if(ap%4==0) {
				n++;
			}else {
			System.out.print(ap+" ");
			}
		}

	}

}

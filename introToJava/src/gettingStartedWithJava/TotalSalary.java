package gettingStartedWithJava;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		String letter=s.next();
		char x=letter.charAt(0);
		int allow=1300;
		if(x=='A') {
			allow=1700;
		}
		if(x=='B') {
			allow=1500;
		}
		double hra=0.20*basic;
		double da=0.50*basic;
		double pf=0.11*basic;
		int totalSalary =(int) (basic+hra+da+allow-pf);
		System.out.println("Total Salary is "+ totalSalary);

	}

}
 
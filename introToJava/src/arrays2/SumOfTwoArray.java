package arrays2;

import java.util.ArrayList;

public class SumOfTwoArray {

	

	public static void main(String[] args) {
		int a[]= {6,2,4};
		int b[]= {7,5,6};
		int num=0;
		int num2=0;
		for(int i=0;i<a.length;i++) {
			num+=a[i];
			if(i!=a.length-1) {
				num*=10;
			} 
		}
		for(int i=0;i<b.length;i++) {
			num2+=b[i];
			if(i!=b.length-1) {
				num2*=10;
			}
		}
		int sum=num+num2;
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		while(sum!=0) {
			int n=sum%10;
			list.add(n);
			sum/=10;	
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
		 
		
		
		
	}


}

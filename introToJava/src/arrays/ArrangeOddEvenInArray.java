package arrays;

public class ArrangeOddEvenInArray {
	public static void arrange(int n) {
	    int arr[]=new int[n];
	    int i=0;
	    int j=arr.length-1;
	    int a=1;
	    while(i<=j)  {
	    	if(a%2!=0) {
	    		arr[i]=a;
	    		i++;
	    		a++;
	    	}else {
	    		arr[j]=a;
	    		j--;
	    		a++;
	    	}
	    	
	    }
	    for(int k:arr) {
	    	System.out.print(k+" ");
	    	}
	}

	public static void main(String[] args) {
		int n=6;
		
		arrange(n);

	}

}

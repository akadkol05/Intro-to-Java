package arrays2;

public class Second_largest {

	public static void main(String[] args) {
		int arr[]= {10,2,15,6,7,3,9,11,1};
		
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 	}
			
			}
			
			
		} 
		for(int i:arr) {
		System.out.print(i+" ");
		} 
		System.out.println();
		System.out.println(arr[n-1]);
		
		

	}

}

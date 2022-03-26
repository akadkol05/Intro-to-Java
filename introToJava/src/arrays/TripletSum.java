package arrays;

public class TripletSum {

	public static void main(String[] args) {
		int arr[]= {1,3,6,2,5,4,3,2,4};
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 for(int k=j+1;j<arr.length;k++) {
					 if(arr[i]+arr[j]+arr[k]==8) {
						 count++;
					 }
				 }
			 }
		 }
		 System.out.println(count);
		

	}

}

package arrays;

public class SwapAlternate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		for(int i=0;i<n-1;i=i+2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
		
	}

}
//1 2 3 4
//2,1,4,3  
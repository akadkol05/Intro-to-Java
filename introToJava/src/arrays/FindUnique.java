package arrays;

public class FindUnique {

	public static void main(String[] args) {
		int arr[]= {2,3,1,6,3,6,2};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum^=arr[i];
			
			
		}
		System.out.println(sum);
	}

}

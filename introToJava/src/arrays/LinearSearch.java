package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(i);
			}
		}

	}

}

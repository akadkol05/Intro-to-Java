package arrays;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int arr[]= {0,2,1,3,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}

	}

}

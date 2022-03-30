package arrays2;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {12,4,6,2,8};
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}

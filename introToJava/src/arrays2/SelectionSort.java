package arrays2;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {12,4,6,2,8};
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					min=j;
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}

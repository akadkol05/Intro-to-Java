package arrays2;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,1,4,6,2};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
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
		
		

	}

}

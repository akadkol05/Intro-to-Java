package arrays2;

public class PushZerosToEnd {

	public static void main(String[] args) {
		int arr[]= {2,0,0,1,3,0,0};
		int k=arr.length-1;
		int i=0;
		while(i<=k) {
			
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k--;
				
				
			}else {
				i++;
				
			}
			
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
	}

}

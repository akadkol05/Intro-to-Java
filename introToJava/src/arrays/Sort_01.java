package arrays;

public class Sort_01 {

	public static void main(String[] args) {
		int arr[]= {0,1,1,0,1,0,1};
		int i=0;
		int j=0;
		int k=arr.length-1;
		while(i<=k){
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[j]; 
				arr[j]=temp;
				i++;
				j++;
				}
		
				else {
				i++;
			   }
			
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

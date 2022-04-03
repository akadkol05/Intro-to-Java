package arrays2;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int d=2;
		

		int a[]=new int[d];
		for(int i=0;i<a.length;i++) {
			a[i]=arr[i];
//			a=1,2,3,4
		}
		for(int i=0;i<arr.length-d;i++) {
			arr[i]=arr[i+d];
//			arr=5,6,7,8,9,10
		}
	
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=a[(i-arr.length)+d];
		
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	
	}

}

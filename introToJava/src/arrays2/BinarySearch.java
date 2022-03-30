package arrays2;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,3,7,9,11,12,45};
		int x=7;
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(arr[m]==x) {
				System.out.println(m);
				return;
			}else if(x>arr[m]) {
				l=m+1;
			}else {
				h=m-1;
			}
		}
		System.out.println(-1);
		

	}

}
 
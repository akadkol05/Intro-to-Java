package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="abcdcba";
		String ans="";
		boolean isPalindrome=true;
		
		for(int i=s.length()-1;i>=0;i--) {
			ans+=s.charAt(i);
		}
		
		if(!s.equals(ans)) {
			isPalindrome=false;
		}
		System.out.println(isPalindrome);

	}

}

package strings;

public class Reverse_String_Wordwise {

	public static void main(String[] args) {
		String str="Always indent your code";
		String s="";
		int j=str.length();
		
		for(int i=str.length()-1;i>=0;i--) {
			if(i==0) {
				s=s+str.substring(i,j);
			}
			if(str.charAt(i)==' ') {
				s=s+str.substring(i+1,j)+" ";
				j=i;	
			}
		}
		System.out.println(s);

	}

}

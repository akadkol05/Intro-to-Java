package strings;

public class CountWords {

	public static void main(String[] args) {
	String s="the fh";
	int count=1;
	
	if(s.length()==0 || s==" ") {
		System.out.println(0);
		return;
	}
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println(count);

	}

}

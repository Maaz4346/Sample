package arrayString;

public class prog4 {
	public static void main(String[] args) {
		String s="maam";
		m1(s);
	}

	private static void m1(String s) {
		String s1="";
		String dubli=s;
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			
		}
		//System.out.println(s1);
		
		if(dubli.equals(s1)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}


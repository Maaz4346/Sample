package arrayString;

public class prog2 {
	public static void main(String[] args) {
		String s="taqi";
		m1(s);
	}

	private static void m1(String s) {
		 char[] ch=new char[s.length()];
		 for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		 }
		 for(char z:ch) {
			 System.out.println(z);
		 }
	}

}


package arrayString;

public class prog1 {
	public static void main(String[] args) {
		char []ch= {'t','a','q','i'};
		m1(ch);
		}

	private static void m1(char[] ch) {
		// TODO Auto-generated method stub
		String s="";
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i];
		}
		System.out.println(s);
	}

}

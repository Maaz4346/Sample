package arrayString;

public class proga {
	public static void main(String[] args) {
		String s="maaz is good boy";
		m1(s);
	}

	private static void m1(String s) {
		String[]s1=s.split("");
		int count=0;
		for(String z:s1) {
			//System.out.println(z);
			count++;
		}
		
		System.out.println(count);
		//System.out.println(s.length());
		
	}

}

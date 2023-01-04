package arrayprograms;

public class demo1 {
public static void main(String[] args) {
	String d="MahaBhaRat";
	char[] ch=d.toCharArray();
	for(int i=0;i<d.length();i++) {
		if((ch[i]>=65)&&ch[i]<=90) {
		int x=ch[i]+32;
		char c=(char)x;
		System.out.println(c);
		}
	/*if((ch[i]>=97)&&ch[i]<=123) {
			int x=ch[i]-32;
			char c=(char)x;
		System.out.println(c);
			}*/
		//System.out.println(c);
		
	}
}
}

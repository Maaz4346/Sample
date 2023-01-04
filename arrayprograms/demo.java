package arrayprograms;

public class demo {
public static void main(String[] args) {
	String d="star";
   for(int i=0;i<d.length();i++) {
	char[]ch=d.toCharArray();
	int x=ch[i]-32;
	char c=(char)x;
	System.out.println(c);
	
	}
	
}
}

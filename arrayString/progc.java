package arrayString;

public class progc {
	public static void main(String[] args) {
	String s="maaz is good booy";
    m1(s);
}

private static void m1(String s) {
	String[] s1= s.split(" "); 
	int Count = 0;
	for(String z:s1) {
		Count++;
}
	System.out.println(Count);
}
}

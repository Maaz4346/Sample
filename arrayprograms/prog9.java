package arrayprograms;

public class prog9 {
	public static void main(String[] args) {
		int []x= {0,1,1,3,1,5};
		m1(x);
		


	}
	public static void m1(int[]x) {
		System.out.println("the second half index is ");
		for(int i=x.length/2;i<x.length;i++) {
			
				System.out.println(x[i]);
			
		}
		
	}
	
}

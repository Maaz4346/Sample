package arrayprograms;

public class prog8 {
	public static void main(String[] args) {
		int []x= {0,1,1,3,1,5};
		m1(x);
		


	}
	public static void m1(int[]x) {
		System.out.println("the first half index is ");
		for(int i=0;i<x.length/2;i++) {
			
				System.out.println(x[i]);
			
		}
		
	}
	
}

package arrayprograms;

public class prog3 {

	public static void main(String[] args) {
		int []x= {0,1,1,3,1,5};
		m1(x);
	}
	public static void m1(int[]x) {
		System.out.println("the odd index is ");
		for(int i=0;i<x.length;i++) {
			if(i%2!=0) {
				System.out.println(x[i]);
			}
		}
		
	}
	
}


	

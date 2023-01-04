package arrayprograms;

public class prog25 {
	public static void main(String[] args) {
		int[]x= {2,4,5,8,9};
		
		m1(x);
		
		
	}

	private static void m1(int[] x) {
		int max=0;
		for(int i=0;i<x.length;i++) {
			if(i%2!=0) {
			if(x[i]>max)
			{
				max= x[i];
			}
			
		}
	}
		System.out.println(max);
	}
}
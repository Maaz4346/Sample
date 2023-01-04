package arrayprograms;

public class prog16 {
	public static void main(String[] args) {
		int []x= {3,5,5,5,6,8};
		m1(x);
		
	}

	public static void m1(int[] x) {
		int min=0;
		int max=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}

		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]<min) {
				min=x[i];
				
			}
			
		}
		System.out.println(min);
		
		
	}

}

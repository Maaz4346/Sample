package arrayprograms;

public class prog14 {
	public static void main(String[] args) {
		int []x= {1,2,5,5,6,8};
		m1(x);
		
	}
	public static void m1(int[]z) {
		System.out.println("the avg value of second half index is :");
		int even=0;int avg=0;int count=0;
		for(int i=z.length/2;i<z.length/2;i++) {
			
				even=even+z[i];
				count++;
				
		}
		//System.out.println(even);
		
		avg=even/count;
		System.out.println(avg);
		
		
	}

}


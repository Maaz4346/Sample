package arrayprograms;

public class prog13 {
	public static void main(String[] args) {
		int []x= {2,2,5,5,6,8};
		m1(x);
		
	}
	public static void m1(int[]z) {
		System.out.println("the avg value of first half index is :");
		int even=0;int avg=0;int count=0;
		for(int i=0;i<z.length/2;i++) {
			
				even=even+z[i];
				
				count++;
		}
		//System.out.println(even);
		
		avg=even/count;
		System.out.println(avg);
		
		
	}

}


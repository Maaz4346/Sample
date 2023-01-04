package arrayprograms;

public class prog12 {
	public static void main(String[] args) {
		int []x= {1,2,5,5,6,8};
		m1(x);
		
	}
	public static void m1(int[]z) {
		System.out.println("the avg value of even index is :");
		int even=0;int avg=0;int count=0;
		for(int i=0;i<z.length;i++) {
			if(i%2!=0) {
				even=even+z[i];		
				count++;
			}	
		}
		avg=even/count;
		System.out.println(avg);
		
		
	}

}

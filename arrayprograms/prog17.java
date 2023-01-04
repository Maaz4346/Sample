package arrayprograms;

public class prog17 {
	public static void main(String[] args) {
		int[]x= {1,2,3,4,5,6,7};
		m1(x);
	}

	private static void m1(int[] x) {
		System.out.println("the even indexed elements are: ");
		for(int i=0;i<x.length;i++) 
		{
			if(i%2==0) {
				System.out.println(x[i]);
			}
		}
		
		}
	
	

}

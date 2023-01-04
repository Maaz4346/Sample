package arrayprograms;

public class prog27 {
	public static void main(String[] args) {
		int[] x= {2,5,1,9,22,8,1};
		m1(x);
	}

	private static void m1(int[] x) {
		int max=0;
		for(int i=x.length/2;i<x.length;i++) 
		{
			if(x[i]>max) {
				max=x[i];
			}
		}
		System.out.println(max);
		
	}
	}


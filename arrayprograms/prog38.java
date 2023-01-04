package arrayprograms;

public class prog38 {
	public static void main(String[] args) {
		int []x= {10,20,30,40,50};
	    m1(x);
	}

	private static void m1(int[] x) {
		// TODO Auto-generated method stub
		for(int i=0;i<x.length;i++) {
			if(x[i]==30) {
				System.out.println(i);
			}
		}
	}
	}

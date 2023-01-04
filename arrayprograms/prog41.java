package arrayprograms;

public class prog41 {
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6};
		m1(x);
	}

	private static void m1(int[] x) {
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]+",");
		}
	}
	}

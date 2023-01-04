package arrayprograms;

public class prog37 {
	public static void main(String[] args) {
		int []x= {10,20,30,40,50};
		m1(x,100);
	}

	private static void m1(int[] x, int y) {
		int pos=1;
		for(int i=x.length-1;i>=2;i--) {
			x[i]=x[i-1];
		}
		x[pos]=100;
		for(int z:x) {
			System.out.println(z);
		}
	}

}

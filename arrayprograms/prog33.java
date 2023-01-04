package arrayprograms;

public class prog33 {
	public static void main(String[] args) {
		int[] x= {1,2,3,4};
		int[] y= {4,5,6};
		m1(x,y);
	}

	private static void m1(int[] x, int[] y) {
		int count=0;
		
		int[]z = new int[x.length+y.length];
	for(int i=0;i<x.length;i++) {
		
		z[count++]=x[i];
	}
	for(int j=0;j<y.length;j++) {
		z[count++]=y[j];
		
	}
	for(int k:z) {
		System.out.println(k);
	}
		
	}  

}

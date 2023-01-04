package arrayprograms;

public class prog35 {
	public static void main(String[] args) {
		int[]x= {2,3,4,5,6,7,8,9};
		m1(x);
	}

	private static void m1(int[] x) {
		// TODO Auto-generated method stub
	for(int i=0;i<x.length;i++) {
		int count=0;
		for(int j=1;j<=x[i];j++) {
			if(x[i]%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(x[i]);
		}
	}	
	}

}


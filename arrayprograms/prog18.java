package arrayprograms;

public class prog18 {
	public static void main(String[] args) {
		int[]x= {1,8,7,9,4,2,5,8};
		m1(x);
	}

	private static void m1(int[] x) {
		int temp=0;
		for(int i=0;i<x.length;i++) {
			
			for(int j=0;j<x.length;i++) {
				
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
		
	}

	

}

package arrayprograms;

public class prog22 {
	public static void main(String[] args) {
		int[]x= {2,5,6,7,1,19,3,10};
        m1(x);	
	}

	private static void m1(int[] x) {
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
				
			}
		}
		
		
		System.out.println(x[x.length-2]);
		
		
	}
}
		
		
	



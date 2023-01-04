package arrayprograms;

public class prog32 {
	public static void main(String[] args) {
		int[] x= {1,28,33,85,22,85,33,2};
		m1(x);
	}

	private static void m1(int[]x) {
		int temp1=0;
		for(int i=0;i<x.length;i++) {
			for(int k=0;k<x.length;k++) {
				if(x[i]<x[k]) {
				temp1=x[i];
				x[i]=x[k];
				x[k]=temp1;
				}
			}
		}
		/*
		 * for(int i=0;i<x.length;i++) { System.out.println(x[i]); }
		 */
		
		
		
		 int j=0; int []temp=new int[x.length]; 
		 for(int i=0;i<x.length-1;i++) {
		 
		 if(x[i]!=x[i+1]) {
		 
		 temp[j]=x[i];
		 j++; }
		 
		 } 
		 
		 temp[j]=x[x.length-1];//to print last digit for(int z:temp) {
		 
		 for(int z:temp) {
		 System.out.println(z); }
		
	}
	}
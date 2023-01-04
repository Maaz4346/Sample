package arrayprograms;

public class prog43 {

	public static void main(String[] args) {
		int[]x= {2,4,11,3,4,12,1,7,12};
		m1(x);
	}

	private static void m1(int[] x) {
		int max=0;
		for (int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
			if(x[i]>x[j]) {
				max=x[i];
				x[i]=x[j];
				x[j]=max;
			}
			}
		
		}
		int j=0;
		int []temp=new int[x.length];
		for(int i=0;i<x.length-1;i++) {
			if(x[i]!=x[i+1]) {
				temp[j]=x[i];
				j++;
			}
		}
		temp[j]=x[x.length-1];
		
		/*
		 * for(int i=0;i<x.length;i++) { System.out.println(temp[i]); }
		 */
		 System.out.println("the 2nd largest no is "+temp[1]);
		
	}
}

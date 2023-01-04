package arrayprograms;

public class prog15 {
	public static void main(String[] args) {
		int []x= {1,2,5,5,6,8};
		m1(x);
		
	}

	public static void m1(int[] x) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				max=x[i];
			}
		}
			System.out.println("the first largest no is: "+max);
		}
	}
	



package arrayprograms;

public class prog23 {
	public static void main(String[] args) {
		int[]x= {2,3,5,9,1,4,7};
		m1(x,3);
	}

	private static void m1(int[] x, int y) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			
			if(x[i]==y) {
				count++;
				
			}
		}
		if(count>0) {
			System.out.println(y+" is present");
		}
		else {
			System.out.println(y+" is not present");
		}
		
	}
	}

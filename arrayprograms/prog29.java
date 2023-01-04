package arrayprograms;

public class prog29 {
	public static void main(String[] args) {
		int[] x= {2,3,4,5,9,5,5};
		m1(x,5);
	}

	private static void m1(int[] x,int y) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==y) {
	        count++;
			}		
	    	}
	    System.out.println("the element "+y+" ocurred "+count+" times");
	    }   
	    
	    }
		


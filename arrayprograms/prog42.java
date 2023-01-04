package arrayprograms;

public class prog42 {
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		m1(x);
	}

	private static void m1(int[] x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]+x[j]==18&&i<j) {	
                 System.out.println(x[i]+","+x[j]);
}
}
  }	
 }		
}

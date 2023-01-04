package arrayprograms;

public class prog39 {
	public static void main(String[] args) {
		int[] x= {10,20,30,40,50,60};
		int[]y= {1,2,3,4,5,20,30};
		int[]z= {6,7,8,9,10,2,30};
	m1(x,y,z);
	}

	private static void m1(int[] x, int[] y, int[] z) {
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				for(int k=0;k<z.length;k++) {
					if(x[i]==y[j]&&y[j]==z[k]) {
						System.out.println(x[i]);
					}
					
				}
				
			}
			
		}
		
	}
	}


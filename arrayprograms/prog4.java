package arrayprograms;

public class prog4 {
	public static void main(String[] args) {
		int []x= {0,1,1,3,1,5};
	
		//int sumdata=sumAllelement(x);
		System.out.println(sumAllelement(x));
	}
	
	public static int sumAllelement(int[] z) {
	int sum=0;
	for(int i=0;i<z.length;i++) {
		sum=sum+z[i];
		
	}
	return sum;
}
}
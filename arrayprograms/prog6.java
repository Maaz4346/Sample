package arrayprograms;

public class Prog6 {
	public static void main(String[] args) {
		int []x= {4,1,1,3,1,5};
	
		//sumAllelement(x);
		System.out.println(sumAllelement(x));
	}
	
	public static int sumAllelement(int[] z) {
		System.out.println("The summation of even index elements from array");
	int sum=0;
	for(int i=0;i<z.length;i++) {
		if(i%2==0) {
			sum=sum+z[i];
		}
		
	}
	return sum;
}
}

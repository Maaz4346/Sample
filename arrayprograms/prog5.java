package arrayprograms;

public class Prog5 {
	public static void main(String[] args) {
		int []x= {4,1,1,3,1,5};
	
		//int sumdata=sumAllelement(x);
		System.out.println(sumAllelement(x));
	}
	
	public static int sumAllelement(int[] z) {
		System.out.println("The average of given elements from array");
	int sum=0,average=0;
	for(int i=0;i<z.length;i++) {
		sum=sum+z[i];
		average=sum/z.length;
		
	}
	return average;
}
}
package arrayprograms;

public class prog36 {
	public static void main(String[] args) {
		int []x= {101,121,122,165,123,333};
	m1(x);
	}

	private static void m1(int[] x) {
		for(int i=0;i<x.length;i++) {
			int num=x[i];int rev=0; int dubli=x[i];
			while(num>0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
				
			}
			if(rev==dubli) {
				System.out.println(x[i]+"  is palindrome");
			}
			else {
				System.out.println(x[i]+" is not a palindrome");
			}
			
		}
		
		
	}

}














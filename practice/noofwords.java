package practice;

public class noofwords {
	public static void main(String[] args) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		 String s=sc.nextLine();
		 //hi how are you
		 
		 for(int i=0;i<s.length();i++) 
		 {
			 if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				 count++;
				 //
			 }
			 
		 }
		 System.out.println("no of words are "+count);
	}

}

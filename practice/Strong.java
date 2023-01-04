package practice;


public class Strong {
	public static void main(String[] args) {
		int num=153;
		while(num>0)
		{
			num=num%10;
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
		}System.out.println(num); 
		
}   
	
}

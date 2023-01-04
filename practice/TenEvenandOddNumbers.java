package practice;
import java.util.Scanner;
public class TenEvenandOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num, i;
System.out.println("Enter the value ");
num = sc.nextInt();
for(i=1;i<=num;i++)
{
	int odd=2*i-1;
System.out.println("odd no is : "+odd);
int even=2*i;
System.out.println("even no is : "+even);

       
   }
	
}
		
}
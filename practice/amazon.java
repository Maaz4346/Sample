package practice;

import java.util.Scanner;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String customername;
long mobileno;
double bill;
double totalbill;
double remainingamount;

System.out.println("enter the customer name");
customername=sc.nextLine();

System.out.println("enter mobile no");
mobileno=sc.nextLong();

System.out.println("enter bill ");
bill=sc.nextDouble();

if ((bill>=1000) && (bill<=5000))
{
	totalbill=bill-(0.30*bill);
}
else if ((bill>5000)&&(bill<7000)) 
{
	totalbill=bill-(0.35*bill);
	
}
else if (bill>7000)
{
	totalbill=bill-(0.40*bill);
	
	System.out.println("congrats you have won extra coupon");
	}
else 
{
	remainingamount=1000-bill;
	System.out.println("please buy more"+remainingamount+"to get discount");
	
	
}
}
}

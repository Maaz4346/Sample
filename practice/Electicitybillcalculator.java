package practice;

import java.util.Scanner;

public class Electicitybillcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		String ConsumerName;
		long phonenumber;
		double units=0;
		double bill=0;
		
		System.out.println("enter the consumer name");
		ConsumerName =sc.nextLine();
		System.out.println("enter the phone number");
		phonenumber =sc.nextLong();
		System.out.println("enter the units consumed");
		units=sc.nextDouble();
		
		
		if (units<=100)
		{
			 bill=units*5.50;
			System.out.println("the total bill of "+ConsumerName+" is :"+bill);
			
		}
		else if ((units>100)&&(units<=300))
		{
		 bill=100*5.50+(units-100)*6.50;	
		System.out.println("the total bill of "+ConsumerName+" is :"+bill);
		
		}
		else if((units>300)&&(units<=600))
		{
		bill=100*5.50+200*6.50+(units-300)*7.50;
		System.out.println("the total bill of "+ConsumerName+" is :"+bill);
		}
		else if(units>600)
		{
		bill=100*5.50+200*6.50+300*7.50+(units-600)*8.50;
		System.out.println("the total bill of "+ConsumerName+" is :"+bill);
		}
		
		
		
	}

}
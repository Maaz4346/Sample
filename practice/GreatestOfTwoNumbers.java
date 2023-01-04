package practice;

import java.util.Scanner;

public class GreatestOfTwoNumbers 
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,greatest;
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		
		if(num1>num2)
		{
			greatest=num1;
			System.out.println("the greatest number is :"+greatest);
			
		}
		else
		{
			greatest=num2;
			System.out.println("the greatest number is :"+greatest);
			
		}
	}
}
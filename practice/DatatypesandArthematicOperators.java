package practice;

import java.util.Scanner;

public class DatatypesandArthematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	/*
		//accept byte data type
		byte  bValue;
		System.out.println("enter byte value");
		bValue=sc.nextByte();

		//accept short data type
		short shValue;
		System.out.println("enter short value");
		shValue=sc.nextShort();

		//accept int data type
		int intValue;
		System.out.println("enter int value");
		intValue=sc.nextInt();

		//accept long data type
		long lValue;
		System.out.println("enter long value");
		lValue=sc.nextLong();

		//accept float data type
		float fValue;
		System.out.println("enter float value");
		fValue=sc.nextFloat();

		//accept double data type
		double dValue;
		System.out.println("enter double value");
		dValue=sc.nextDouble();
		
		//accept char data type
		char chValue;
		System.out.println("enter char value");
		dValue=sc.next().charAt(0);
				
				
		//accept boolean data type			
		boolean bolValue;
		System.out.println("enter boolean value");
		bolValue=sc.nextBoolean();
		
		//accept string data type			
		String strValue;
		System.out.println("enter string value");
		strValue=sc.next();		
		System.out.println("the value of string is " +strValue);
		
		*/
		//perform addition
		int num1,num2,sum;
		System.out.println("enter num1 value and num2 for addition");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("the sum of "+num1+" and "+num2+" is :"+sum );
		
		//perform subtraction
				int diff;
				System.out.println("enter num1 value and num2 for subtraction");
				num1=sc.nextInt();
				num2=sc.nextInt();
				diff =num1-num2;
				System.out.println("the diff of "+num1+" and "+num2+" is :"+diff );
				
				//perform multiplication
				int mul;
				System.out.println("enter num1 value and num2 for multiplication");
				num1=sc.nextInt();
				num2=sc.nextInt();
				mul =num1*num2;
				System.out.println("the product of "+num1+" and "+num2+" is :"+mul );		
				
				
				//perform division
				int div;
				System.out.println("enter num1 value and num2 for division");
				num1=sc.nextInt();
				num2=sc.nextInt();
				div =num1/num2;
				System.out.println("the div of "+num1+" and "+num2+" is :"+div );			
				
				
				//perform increment
				int inc;
				System.out.println("enter num1 value for increment");
				num1=sc.nextInt();
				inc=num1++;
				System.out.println("the increment of "+inc+" is :"+num1);
		
				
				//perform decrement
				int dec;
				System.out.println("enter num1 value for decrement ");
				num1=sc.nextInt();
				dec=num1--;
				System.out.println("the decrement of "+dec+" is :"+num1--);
		
		
		

	}

}

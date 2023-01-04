package practice;

import java.util.Scanner;

public class ArthematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//perform addition
				int num1,num2,sum;
				num1=0;
				num2=0;
				System.out.println("enter num1 value and num2");
				num1=sc.nextInt();
				num2=sc.nextInt();
				sum=num1+num2;
				System.out.println("the sum of "+num1+" and "+num2+" is :"+sum );
				
				//perform subtraction
						int diff;
						System.out.println("enter num1 value and num2");
						num1=sc.nextInt();
						num2=sc.nextInt();
						diff =num1-num2;
						System.out.println("the diff of "+num1+" and "+num2+" is :"+diff );
						
						//perform multiplication
						int mul;
						System.out.println("enter num1 value and num2");
						num1=sc.nextInt();
						num2=sc.nextInt();
						mul =num1*num2;
						System.out.println("the product of "+num1+" and "+num2+" is :"+mul );		
						
						
						//perform division
						int div;
						System.out.println("enter num1 value and num2");
						num1=sc.nextInt();
						num2=sc.nextInt();
						div =num1/num2;
						System.out.println("the diff of "+num1+" and "+num2+" is :"+diff );			
						
						
						//perform increment
						int inc;
						System.out.println("enter num1 value ");
						num1=sc.nextInt();
						inc=num1++;
						System.out.println("the increment of "+num1+" is :"+inc );
				
						
						//perform increment
						int dec;
						System.out.println("enter num1 value ");
						num1=sc.nextInt();
						dec=num1--;
						System.out.println("the decrement of "+num1+" is :"+dec );
				
	}

}

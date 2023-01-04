package practice;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check positive or negative ");
		  i= sc.nextInt();
		  if(i<0)
		  {
			System.out.println("Entered number is negative ");   
		  }
		  else if(i>0)
		  {
         System.out.println("Entered number is positive ");
		  }
		  else
		  {
			  System.out.println("Entered number is zero");
			  
		  }
	}
	
}
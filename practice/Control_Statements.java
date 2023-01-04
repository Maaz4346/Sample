package practice;

import java.util.Scanner;

public class Control_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter the value between 1 to 10");
		n=sc.nextInt();
				while (n<1||n>10)
				{
					System.out.println(n+" is not between 1 to 10.Try again");
					n=sc.nextInt();
					
					
				}
				System.out.println(n+" is between 1 and 10");
		
	}

}

package practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no");
		num=sc.nextInt();
		double square=Math.pow(num, 2);
System.out.println("the square of the number is :"+square);

sc.close();
	}
	 
}
		
package arrayprograms;

import java.util.Scanner;

public class prog1 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[]x=new int[5];
		System.out.println("enter the data");
		for(int i=0;i<5;i++)//to store the data
		{
			x[i]=s.nextInt();
		
			
		}
		System.out.println("the entered data is:");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
	       }
			
	}

}

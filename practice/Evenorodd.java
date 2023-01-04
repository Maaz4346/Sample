package practice;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
        int num;
		System.out.println("enter the number");
         num=n.nextInt();
        
         switch (num % 2) 
        {
        case 0:
        	System.out.println(num+" is even");
        	break;
        	
        default:
        	System.out.println(num+" is odd");
        	break;
        
        
        }



	}

}
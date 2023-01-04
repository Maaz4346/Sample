package practice;

import java.util.Scanner;

public class Checkthecahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("enter the any thing");
ch=sc.next().charAt(0);
if ((ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z'))
{
	System.out.println("you have entered a char ");
}
else if ((ch>='1')&&(ch<='9'))
{
	System.out.println("you have entered a number ");
}
else
{
	System.out.println("you have entered a symbol");
}
	}

}

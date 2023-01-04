package practice;

import java.util.Scanner;

class VoterEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age, shrt;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the age :");
age =sc.nextInt();
 if(age>=18)  
    {
	System.out.println("congratulation Welcome to votig system");
	}
	else
	 {
     shrt=(18-age);
	System.out.println("You are not eligible for vote and you need  "+shrt+" years more to be eligile");
     
	 }
  
  } 
}

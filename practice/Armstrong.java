package practice;

public class Armstrong {

			public static void main(String[] args) 
		{
	int num=153,count=0,temp=num,sum=0,dubli=num;
	while(num>0)
			{
		num=num/10;
			count++;
	}
	System.out.println("the count of given number is:"+count);
	while(temp>0)
			{
		      int mul=1;
		        int rem=temp%10;//rem=3,rem=5,rem=1
		        for (int i=1;i<=count ;i++ )
		       {
			      mul=mul*rem;//mul=27,mul=125,mul=1
		       }
	               sum=sum+mul;//27+125+1
			        temp=temp/10;//15,1,0
			}
			if (sum==dubli)
			{
	            System.out.println("the num is armstrong number :"+sum);
			}
			else
			{ 
	            System.out.println("the num is not armstrong number"+sum);
			}

	}
		
	}

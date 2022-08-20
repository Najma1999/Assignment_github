package MamAss;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		loop1: while(true)
		{
			System.out.println("enter number:");
			int num=sc.nextInt();
            if(num<0)
            	break loop1;
            
            if(checkPalindrome(num))
            	System.out.println("Number is Palindrome:");
            else
            	System.out.println("number is not Palindrome");
		}
	  }
	  static boolean checkPalindrome(int num)
	  {
		  int originalNum=num;
		  int rem,rev=0;
		  while(num>0)
		  {
			  rem=num%10;
			  rev=num/10;
		  }
		  System.out.println(rev);
		  if(originalNum==rev)
		  {
			  return true;
		  }
		  else
			  return false;
	  }
	}	









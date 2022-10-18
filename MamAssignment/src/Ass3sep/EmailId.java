package Ass3sep;

import java.util.Scanner;

public class EmailId {

	public static void main(String[] args) {

	   String s="najma@gmail.com";
	   char arr[]=s.toCharArray();
	   int flag1=1, flag2=1;
	   for(int i=0;i<arr.length; i++)
	   {
		   if(arr[i]=='@')
		   {
			   flag1=1;
		   }
		   if(arr[i]=='.')
		   {
			   flag2=2;
		   }
	   }
	   if(flag1==1 && flag2==1)
	   {
		   System.out.println("Email is not valid");
	   }
	   else
		   System.out.println("Email is  valid");
	}

}

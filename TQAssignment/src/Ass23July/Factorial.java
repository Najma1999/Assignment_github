package Ass23July;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
       int num, sum=0;
       int fact=1 , i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of terms:");
       int n1=sc.nextInt();
       
       for( i=1; i<=n1; i++)
       {
    	  fact=fact*i;
    	  sum=sum*fact;
       }
       System.out.println(fact);
       
	}

}

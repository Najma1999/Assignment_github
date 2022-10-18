package Ass3sep;

import java.util.Scanner;

//WAP to check whwther two strings are anagram or not
public class Anagram {

	public static void main(String[] args) {
         String strOne, strTwo;
         int lenOne, lenTwo, i, j, found=0, notFound=0;
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enetr First String");
         strOne=sc.next();
         System.out.println("Enter second String");
         strTwo=sc.next();
         
         lenOne=strOne.length();
         lenTwo=strTwo.length();
         
         if(lenOne==lenTwo)
         {
        	 for(i=0; i<lenOne; i++)
        	 {
        		 found=0;
        		 for(j=0; j<lenOne; j++)
        		 {
        			 if(strOne.charAt(i)==strTwo.charAt(j))
        			 {
        				 found=1;
        				 break;
        			 }
        		 }
        		 if(found==0)
        		 {
        			 notFound=1;
        			 break;
        		 }
        	 }
        	 if(notFound==1)
        		 System.out.println("String not anagram");
        	 else
        		 System.out.println("String are anagram");
         }
         else
        	 System.out.println("Length of String mismatch");
	}

}

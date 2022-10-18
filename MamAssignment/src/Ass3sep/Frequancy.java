package Ass3sep;

import java.util.Scanner;

public class Frequancy {

	public static void main(String[] args) {

		String str;
        char ch, strChar;
        int strLen, count=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String");
        str=sc.next();
        System.out.println("enter character to find frequncy");
        ch=sc.next().charAt(0);
         strLen=str.length();
        for(int i=0; i<strLen; i++)
        {
        	strChar=str.charAt(i);
        	if(ch==strChar)
        		count++;
        }
        System.out.println("frequancy=" +count);
		
	}

}

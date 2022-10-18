package Ass3sep;

import java.util.Scanner;

public class VowelConverter {

	public static void main(String[] args) {

		String s="java"; 
		int count=0;
		char ch[]=s.toCharArray();
				for (int i=0; i<ch.length;i++)
				{ 
			    	if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				         {
				     	    ch[i]=(char) (ch[i]+1);	
				         }
				
					System.out.print(ch[i]);
		        }
}
}
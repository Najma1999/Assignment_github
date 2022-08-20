package Ass6Aug;

import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			total=total+i;
		}
		System.out.println("total of items:" +total);
	}

}

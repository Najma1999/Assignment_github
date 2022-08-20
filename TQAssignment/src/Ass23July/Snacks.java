package Ass23July;

import java.util.Scanner;

public class Snacks {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter the no of pizzas bought:");
    int piz=sc.nextInt();
    System.out.println("Enter the no of puffs bought");
    int puf=sc.nextInt();
    System.out.println("Enter the no of cooldrink sbought");
    int cd =sc.nextInt();
    
    System.out.println("Bill Details:");
    System.out.println("No of pizzas:" +piz);
    System.out.println("No of puffs:" +puf);
    System.out.println("No of cooldrinks:" +cd);
	
	System.out.println("Total Prizes=" +(piz*100+puf*20+cd*10));
	
	System.out.println("ENJOY THE SHOW!!!");
	}

}

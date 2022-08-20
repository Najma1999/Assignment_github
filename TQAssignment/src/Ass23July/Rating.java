package Ass23July;

import java.util.Scanner;

public class Rating {
int b_id;
String b_name;
String authorName;
double price;
String rating;

public void accept()
     {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter b_id");         
	   int b_id=sc.nextInt();
	
       System.out.println("Enter b_name");
	   String b_name=sc.nextLine();
    	
	   System.out.println("Enter authorName");
	   String authorName=sc.nextLine();

       System.out.println("Enter price");
	   double price=sc.nextDouble();
	  }
  
    public void giveRating()
    {
        
        System.out.println(101);
        System.out.println("Java.50");
        System.out.println("XYZ");
        System.out.println(220);
        System.out.println("GOOD");
    }
	public static void main(String[] args) {
	       Rating r=new Rating();
	       r.accept();
	       r.giveRating();
	       
	}
    }


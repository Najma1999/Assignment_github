package Ass13aug;
/*WAP to create a class Kid with method readBook() and another method  readBook () with 2 parameters. 
 * The method readBook here is over-loaded. Create a class BigKid which extends Kid created above and Implement
 * readBook() differently in BigKid class. Here the method readBook() has been over-ridden in the child class BigKid().*/
import java.util.Scanner;

class Kid
{
	int noOfPages;
	
	public void readbook(int noOfPages)
	{
		System.out.println("No of Pages Book in Kid is....." +noOfPages);
	}
}
class BigKid extends Kid
{
	int noOfPages;
	String bName;
	
	public void readbook(int noOfPages)
	{
		super.readbook(35);
		System.out.println("No of Pages Book in BigKid is....." +noOfPages);
	}
	public void readbook(int noOfPages, String bName)
	{
		System.out.println("No of Pages Book in BigKid is....." +noOfPages);
         System.out.println("Name of Book in BigKid is........" +bName);
	}
}
public class Q6BigKid 
{
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the page no of Book");
    	 int noOfPages=sc.nextInt();
    	 System.out.println("Eneter the nam of book");
    	 String bName=sc.next();
    	 
    	 BigKid b=new BigKid();
    	 b.readbook(noOfPages);
    	 b.readbook(noOfPages, bName);
     }
}

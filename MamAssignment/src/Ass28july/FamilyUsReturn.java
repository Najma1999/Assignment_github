package Ass28july;

import java.util.Scanner;

public class FamilyUsReturn {

	static String fatherName;
	int fatherAge;
	String motherName;
	int motherAge;
	String brotherName;
	int brotherAge;
	String myName;
	int myAge;
	int totalMember;

	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fatherName:");
		sc.next();
		System.out.println("Enter fatherAge:");
		sc.nextInt();
		System.out.println("Enter motherName:");
		sc.next();
		System.out.println("Enter motherAge");
		sc.nextInt();
		System.out.println("Enter brotherName:");
		sc.next();
		System.out.println("Enter brotherAge:");
		sc.nextInt();
		System.out.println("Enter myName:");
		sc.next();
		System.out.println("Enter myAge");
		sc.nextInt();
		System.out.println("Enter totalMember:");
		sc.nextInt();
	}
	void display()
	{
		System.out.println("fatherName is...." +fatherName);
		System.out.println("fatherAge is...." +fatherAge);
		System.out.println("motherName is...." +motherName);
		System.out.println("motherAge is...." +motherAge);
		System.out.println("brotherName is...." +brotherName);
		System.out.println("brotherAge is...." +brotherAge);
		System.out.println("myName is...." +myName);
		System.out.println("myAge is...." +myAge);
		System.out.println("totalMember is..." +totalMember);
	}
	int totalMember()
	{
		return totalMember;
	}
	public static void main(String[] args) {
      FamilyUsReturn f=new FamilyUsReturn();
      f.accept();
    		  f.display();
	}

}

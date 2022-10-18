package Ass27Aug;

import java.util.Scanner;

public class Student {

	int id; 
	String name; 
	static boolean isspecial =false;
	private static String CName;
	Course c;
	
	public Student(int id, String name, Course c)
	{
		this.id=id;
		this.name=name;
		this.c=c;
	}
	public String toString()
	{
		return "Student id is "+id+"\n Student Name is "+name+" "+isspecial+ "course "+c;
	}
	public boolean check(int fees)
	{
		if(fees>50000)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args)
	{
		Course[] c= new Course[2];
		Student s[]= new Student[2];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println("enetr student name");
			String name=sc.next();
			System.out.println("enetr student id");
			int id=sc.nextInt();
			System.out.println("Enter Course name");
			String CName=sc.next();
			System.out.println("enetr student fees");
			int fees=sc.nextInt();
			
			c[i]=new Course(CName, fees);
			s[i]=new Student(id,name,c[i]);
			boolean check=s[i].check(fees);
			if(check==true)
			{
				isspecial=true;
			}
		}
		for(int i=0;i<5; i++)
		{
			System.out.println(s[i]);
			System.out.println(c[i]);
		}
	}
}

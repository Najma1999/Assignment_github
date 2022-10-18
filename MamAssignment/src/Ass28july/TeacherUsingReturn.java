package Ass28july;

import java.util.Scanner;

public class TeacherUsingReturn {

	static String teacherName;
	String Subject;
	int noOfStudent;
	int presentStudent;
	int AbStudent;
	
	void acccept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teacherName:");
		sc.next();
		System.out.println("Enter Subject:");
		sc.next();
		System.out.println("Enter noOfStudent:");
		sc.nextInt();
		System.out.println("Enter presentStudent:");
		sc.nextInt();
		System.out.println("enter AbStudent:");
		sc.nextInt();
	}
	void display()
	{
		System.out.println("teacherName" +teacherName);
		System.out.println("Subject" +Subject);
		System.out.println("noOfStude" +noOfStudent);
		System.out.println("presentStudent" +presentStudent);
		System.out.println("AbStudent" +AbStudent);
	}
	int noOfStudent()
	{
		return noOfStudent;
	}
	int presentStudent()
	{
		return presentStudent;
	}
	int AbStudent()
	{
		return AbStudent;
	}
	public static void main(String[] args) {
		TeacherUsingReturn t=new TeacherUsingReturn();
		   t.acccept();
		   t.display();
//		TeacherUsingReturn t2=new TeacherUsingReturn();
//		   t2.acccept();
//		   t2.display();
//		
	}

}

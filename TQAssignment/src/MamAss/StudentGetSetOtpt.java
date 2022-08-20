package MamAss;

import java.util.Scanner;

public class StudentGetSetOtpt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student name....");
		String StudentName=sc.next();
		System.out.println("Enter student rollno....");
		int rollNo=sc.nextInt();
		System.out.println("Enter student department....");
		String Department=sc.next();
 
		StudentGetSet s=new StudentGetSet();
		s.set_StudentName(StudentName);
		s.set_rollNo(rollNo);
		s.set_Department(Department);
		
		System.out.println(s.get_StudentName());
		System.out.println(s.get_rollNo());
		System.out.println(s.get_Department());
	}

}

package Ass27Aug;

public class Course {

	String CName;
	int fees;
	
	public Course(String CName, int fees)
	{
		this.CName=CName;
		this.fees=fees;
	}
	public String toString()
	{
		return "Course Name is "+CName+ "   Course fees  " +fees; 
	}
}

package Ass28july;

public class Teacher {

	static String teacherName;
	String Subject;
	int noOfStudent;
	
	public Teacher(String teacherName,String Subject, int noofStudent)
	{
		this.noOfStudent=noOfStudent;
		this.Subject=Subject;
		this.teacherName=teacherName;
	}
	void display()
	{
		System.out.println("TeacherName is...." +teacherName);
		System.out.println("Subject is........" +Subject);
		System.out.println("noOfStudent is...." +noOfStudent);
	}
	public static void main(String[] args) {
           teacherName="Seema";
           Teacher t=new Teacher("java", "seema",15);
           t.display();
	}

}

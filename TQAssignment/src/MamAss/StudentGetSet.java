package MamAss;

public class StudentGetSet {
	private String StudentName;
     private int rollNo;
	private String Department;
	
	 public void set_StudentName(String studentname )
	 {
		 this.StudentName=studentname;
	 }
	 public String get_StudentName()
	 {
		 return StudentName;
	 }
	 public void set_rollNo(int rollno)
	 {
		 this.rollNo=rollno;
	 }
	 public int get_rollNo()
	 {
		 return rollNo;
	 }
	 public void set_Department(String department)
	 {
		 this.Department=department;
	 }
	 public String get_Department()
	 {
		 return Department;
	 }
	
}

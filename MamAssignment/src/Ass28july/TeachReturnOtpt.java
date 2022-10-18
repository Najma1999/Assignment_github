package Ass28july;

public class TeachReturnOtpt {

	public static void main(String[] args) {

		TeacherUsingReturn t=new TeacherUsingReturn();
		t.acccept();
		
		int presentStudent=t.presentStudent();
		int  AbStudent=t.AbStudent();
			
		if(presentStudent<20 && AbStudent>30)
		{
			System.out.println("Student is present");
		}
		else
			System.out.println("Student is absent");
	}

}

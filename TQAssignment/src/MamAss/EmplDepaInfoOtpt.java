package MamAss;

public class EmplDepaInfoOtpt {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.set_Name("Ramesh");
		e.set_Salary(65000);
		System.out.println(e.get_Name());
		System.out.println(e.get_Salary());
		
		EmplDepartment d=new EmplDepartment();
		d.set_DeptId(101);
		d.set_DeptName("IT");
		System.out.println(d.get_DeptId());
		System.out.println(d.get_DeptName());
		
		EmplInformation i=new EmplInformation();
		i.set_Day("Wednesday");
		i.set_Month("March");
		i.set_Year(1999);
		System.out.println(i.get_Day());
		System.out.println(i.get_Month());
		System.out.println(i.get_Year());
	}

}

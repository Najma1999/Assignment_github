package CollectionAss;


public class EmployeeDetails implements Comparable<EmployeeDetails>{

	int age;
	String name, designation;
	
	public EmployeeDetails(int age, String name, String designation) 
	{
		this.age = age;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public int compareTo(EmployeeDetails d) 
	{
		return this.name.compareTo(d.name);
	}
	
}

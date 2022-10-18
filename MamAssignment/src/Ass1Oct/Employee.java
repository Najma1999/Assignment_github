package Ass1Oct;

public class Employee implements Comparable<Employee>{

	int eId;
	String name; 
     float salary;
	 EmpDepartment d;
	
	public Employee(int eId, String name, float salary, EmpDepartment d)
	{
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}
	public void set_eId(int eId)
	{
		this.eId=eId;
	}
	public int get_eId()
	{
		return eId;
	}
	public void set_name(String name)
	{
		this.name=name;
	}
	public String get_name()
	{
		return name;
	}
	public void set_salary(float salary)
	{
		this.salary=salary;
	}
	public float get_salary()
	{
		return salary;
	}
	public void set_EmpDepartment(EmpDepartment d)
	{
		this.d=d;
	}
	public EmpDepartment get_EmpDepartement()
	{
	      return d;	
	}
	@Override
	public String toString()
	{
		return eId + " "  +name+ " "  +salary+ "  " +d;
	}
	@Override
	public int compareTo(Employee sal) 
	{
		if(salary<sal.salary)
			return -1;
		if(salary<sal.salary)
			return 1;
		else
		return 0;
	}
	
}

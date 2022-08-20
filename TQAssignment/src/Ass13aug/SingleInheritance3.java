package Ass13aug;

class Employee
{
	void display()
	{
		System.out.println("Salary....." +(50000));
	}
}
class Company extends Employee
{
	void display()
	{
		super.display();
		System.out.println("Bonus....." +(20000));
	}
}
public class SingleInheritance3 
{
	public static void main(String[] args)
	{
       Company c=new Company();
       c.display();
       //c.show();
	}
}

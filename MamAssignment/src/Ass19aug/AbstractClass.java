package Ass19aug;

abstract class Cycle
{
	int wheels=2;
	String color="Pink";
	
	Cycle()
	{
		System.out.println("Show cycle Wheels..");
	}
	void show()
	{
		System.out.println("Show Cycle color");
	}
	abstract public void specific_Implement();
}
class Avon extends Cycle
{
	Avon(String str)
	{
		
	}
	@Override
	public void specific_Implement() 
	{
	    System.out.println("cycle is Avon");
	    System.out.println("cycle color is pink");
	    System.out.println("cycle wheels is 2");
	}
}
public class AbstractClass 
{
	public static void main(String[] args) 
	{
         Cycle c= new Avon("Avon");
         c.show();
         c.specific_Implement();
	}

}

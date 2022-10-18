package Ass19aug;

abstract class Car
{
	int wheels=4;
	String color="Black";
	
	Car()
	{
		System.out.println("Show car Wheels..");
	}
	void show()
	{
		System.out.println("Show Car color");
	}
	abstract public void specific_Implement();
}
class Kia extends Car
{
	Kia(String str)
	{
		
	}
	@Override
	public void specific_Implement() 
	{
	    System.out.println("car is Kia");
	    System.out.println("car color is Black");
	    System.out.println("car wheels is 4");
	}
}
public class Abstraction 
{
	public static void main(String[] args) 
	{
          Car c=new Kia("Kia");
          c.show();
          c.specific_Implement();
	}

}

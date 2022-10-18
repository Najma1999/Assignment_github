package Ass13aug;

class Car
{
	void display()
	{
		System.out.println("Car");
	}
}
class Kia extends Car
{
	void display()
	{
	    super.display();
		System.out.println("KIA");
		System.out.println("Speed Max....90km");
		System.out.println("Color......White");
	}
}
class  Wagonr extends Kia
{
	void display()
	{
		super.display();
		System.out.println("Wagonr");
		System.out.println("Speed Max....80km");
		System.out.println("Color......Silver");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) 
	{
		Wagonr w=new Wagonr();
		w.display();
    }

}

package Ass19aug;

interface Animal
{
	//int legs=4;
	void AnimalSleep();
}
interface AnimalRun extends Animal
{
	//String color="White";
    void AnimalRun();
}
class Cat implements AnimalRun
{
	@Override
	public void AnimalSleep() 
	{
		System.out.println("Cat is Sleep..");
	}
	@Override
	public void AnimalRun() 
	{
		System.out.println("Cat says Meow Meow...");
	}
	
}
public class Interface {

	public static void main(String[] args) 
	{
       Cat c=new Cat();
       c.AnimalRun();
       c.AnimalSleep();
	}

}

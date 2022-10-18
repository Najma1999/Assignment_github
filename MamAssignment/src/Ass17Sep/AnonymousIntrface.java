package Ass17Sep;

interface Animal
{
	public void run();
}
class Dog 
{
	public void eat()
	{
		Animal a=new Animal() 
		{
			@Override
			public void run() 
			{
		    	 System.out.println("Inside the anonymous class");
			}
		};
		a.run();
	}
}
public class AnonymousIntrface {

	public static void main(String[] args) {

		  Dog d=new Dog();
		  d.eat();
	}

}

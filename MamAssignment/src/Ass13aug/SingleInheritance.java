package Ass13aug;
//SINGLE INHERITANCE

class Animal
{
   void display()
    {
	   System.out.println("Eating...");
    }
}
class Dog extends Animal
{
   void display()
     {
	   super.display();
	    System.out.println("Barking....");
     }
}
public class SingleInheritance {
	public static void main(String[] args) 
	{
		Dog d=new Dog();
	    d.display();	
	}

}

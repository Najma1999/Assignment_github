package Ass13aug;

class birds
{
	void display()
	{
		System.out.println("flying");
	}
}

class Parrot extends birds
{
	void display()
	{
		super.display();
       System.out.println("Green");		
	}
}
class Crow extends birds
{
	void display()
	{
	super.display();
    System.out.println("Black");
	}
}
public class HirericalInheritance
{
	public static void main(String[] args) 
	{
          Crow s=new Crow();
          s.display();
	}

}

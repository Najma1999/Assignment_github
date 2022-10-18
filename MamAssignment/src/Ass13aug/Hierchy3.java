package Ass13aug;

class Mobile
{
	void display()
	{
		System.out.println("Camera");
	}
}
class Nokia extends Mobile
{
	void display()
	{
		super.display();
  	   System.out.println(" Quality is good");
    }
}
class Apple extends Mobile
{
	void display()
	{
		super.display();
		System.out.println("Awesome");
	}
}
public class Hierchy3 
{
	public static void main(String[] args) 
	{
        Mobile m=new Mobile();
        m.display();
	}

}

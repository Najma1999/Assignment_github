package Ass13aug;

class anniimmaall
{
   void display()
    {
	   System.out.println("Eating...");
    }
}
class Ddoogg extends anniimmaall
{
    void display()
    {
    	super.display();
	    System.out.println("Barking....");
    }
}
class BabyDog extends Ddoogg
{  
    void display()
    {
    	super.display();
	    System.out.println("weeping...");
	}  
}  
public class Multilevel 
{
	public static void main(String[] args) 
	{
       BabyDog b=new BabyDog();
       b.display();
	}
}

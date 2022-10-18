package Ass17Sep;

abstract class Mango
{
	abstract void eat();
}
public class AnonymousAbstract {

	public static void main(String[] args) {
          Mango m=new Mango()
        		  {

					@Override
					void eat() 
					{
						System.out.println("Nice fruit");
					}
        	  
        		  };
          m.eat();
	}

}

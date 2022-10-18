package Ass17Sep;

class Person
{
	public void show()
	{
		System.out.println("person is walking");
	}
}
public class ConcretteClass {

	public static void main(String[] args) {

		Person p=new Person()
		{ 
             public void show()
             {
            	 System.out.println("eating");
             }
		};
		p.show();
	}

}

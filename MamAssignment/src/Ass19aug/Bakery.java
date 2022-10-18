package Ass19aug;

interface Cake
{
	void bake();
}
class Strawberry implements Cake
{
	public void bake()
	{
	      System.out.println("Strawberry cake is ready");	
	}
}
class Blackforest implements Cake
{
	public void bake()
	{
		System.out.println("Blackforest cake is ready");
	}
}
public class Bakery {

	public static void main(String[] args) 
	{
		Strawberry s=new Strawberry();
		s.bake();
		Blackforest b=new Blackforest();
		b.bake();
	}

}

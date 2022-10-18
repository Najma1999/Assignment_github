package Ass19aug;

interface IceCream
{
	void Eat();
	void Juice();
	void Drink();
}
class Mastani implements IceCream
{
	@Override
	public void Eat() 
	{
		System.out.println("pinku eat icecream");
	}
	@Override
	public void Juice() 
	{
		System.out.println("pinku order juice");
	}
	@Override
	public void Drink() 
	{
		System.out.println("pinku oreder drink");
	}
}
public class IceCreamMain
{
	public static void main(String[] args) 
	{
		Mastani m=new Mastani();
		m.Drink();
		m.Eat();
		m.Juice();
	}
}

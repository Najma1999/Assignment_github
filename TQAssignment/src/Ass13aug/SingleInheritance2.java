package Ass13aug;

class Rectangle
{
	void rectangle(int l, int b)
	{
			System.out.println("rectangle....." +(l*b));
	}
}
class Square extends Rectangle
{
	//int s;
	void square(int s)
	{
		System.out.println("squar....."   +(s*s));
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) 
	{
        Square s=new Square();
        s.square(45);
        s.rectangle(12,34);
	}
}

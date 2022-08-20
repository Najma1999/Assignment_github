package Ass30july;

public class Arithmatic {

	//static int add,sub,multi,div;
	
	static int addition(int a, int b)
	{
		return a+b;
	}
	static int substraction(int a, int b)
	{
		return a-b;
	}
	static int multiplication(int a, int b)
	{
		return a*b;
	}
	static int division(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
        Arithmatic a=new Arithmatic();
        System.out.println("Addition is...."  +  addition(20, 30));
        System.out.println("Substraction is...." +substraction(20, 40));
        System.out.println("Multiplition is...." +multiplication(20, 50));
        System.out.println("Division is...." +division(200, 20));

	}

}

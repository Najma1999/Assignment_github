package MamAss;

public class IntChar {
	
	int n;
	char c;
	
	void integer(int i, char c)
	{
		System.out.println("Integer value is:" +n);
		System.out.println("char value is:" +c);
	}
	void display(char c, int n)
	{
		System.out.println("char value is..." +c);
		System.out.println("Integer value is.." +n);
	}
	public static void main(String[] args)
	{
       IntChar ic=new IntChar();
       System.out.println(" For Integer Method ");
       ic.integer(16, 'a');
       System.out.println(" For Charcter Method ");
       ic.display('B',12);
	}

}

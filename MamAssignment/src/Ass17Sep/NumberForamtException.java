package Ass17Sep;

public class NumberForamtException {

	public static void main(String[] args) {

		try
		{
			int i;
			String s="123.23";
			int a=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid String");
		}
	}

}

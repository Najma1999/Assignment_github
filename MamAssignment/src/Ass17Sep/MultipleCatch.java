package Ass17Sep;
/* WAP TO SHOW CHECKED EXXCEPTION AND USE MULTIPLE CATCH BLOCK 
 * WITH UNIVAERSAL EXCEPTION HANDLER*/
public class MultipleCatch {

	public static void main(String[] args) {

		try
		{
		  int arr[]=new int[5];
		  arr[5]=30/0;
	    }
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occure");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of Boundde exception occure");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("rest of code");
	}
}

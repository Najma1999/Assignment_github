package Ass17Sep;
/*write a custom exception where we generateexception if our balance is
 * less than 1000 . it should throw insufficient*/
//import ExceptionHandling.InsufficientBalnce1;

public class InsufficientBal extends RuntimeException{

	private static int accno[]= {1001};
	private static String name[]= {"raja rao"};
	private static double bal[]= {10000.00};
	static int i;
	
	void accept()throws InsufficientBal
	{
		 System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");
	        for(i=0; i<5; i++)
	        {
	        	System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
	        	{
	        	  if(bal[i]<1000)
	        	  {
	        		throw new InsufficientBal();
	        	  }
	         	}
	        }  
   }
	public static void main(String[] args) {
		InsufficientBal i=new InsufficientBal();
		try
		{i.accept();}
		catch(Exception e)
		{
			System.out.println("Insufficient Balance");
		}
	}
}

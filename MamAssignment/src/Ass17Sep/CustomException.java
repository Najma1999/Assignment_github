package Ass17Sep;

class AgeException  extends Exception
{
    public AgeException(String s)
     {
	   super(s);
     }
}
public class CustomException {
	static void validate (int age)throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("age is not valid to Vote");
		}
		else
			System.out.println("age is valid to Vote");
	}
	public static void main(String[] args) {
           try
           {
        	   validate(21);
           }
           catch(AgeException e)
           {
        	   System.out.println("not exception");
        	   System.out.println("exception occured");
           }
           System.out.println("rest of code");
	}

}

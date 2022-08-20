package Ass13aug;
/*Create a class Teenager which extends Kid created above and Implement readBook() differently in Teenager class. 
 In main method, declare two variables k1,k2 of type Kid. Create objects of type BigKid and Teenager such
that K1 should reference object of class BigKid and K2 should reference
object of class Teenager, Call their respective readBook() methods.*/
class Teenager extends Kid
{
	int no;
	public void readbook(int no)
	{
		System.out.println("Readbook Method Call of Teenager");
	}
}
public class Q7Teenager
{
	public static void main(String[] args) 
	{
         Kid k1;
         k1=new BigKid();
         k1.readbook(200);
         
         Kid k2;
         k2=new Teenager();
         k2.readbook(200);

	}

}

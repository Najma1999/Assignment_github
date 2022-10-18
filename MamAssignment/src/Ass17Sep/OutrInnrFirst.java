package Ass17Sep;
/*CRETE CLASS OUTER IN WHICH YOU WILL HAVE PRIVATE, PUBLIC,STATIC AND
 * STATIC FINAL VARIABLE .STATIC AND NON STATIC INNER CLASS IN OUTER CLAS.TRY TO ACCESS ALL VARIBLES IN BOTH INNER CLASSES
 * AND CHECK WHICH ARE NOT ACCESSABLE.*/
class Outer
{
	private int a=10;
	public int b=20;
	static int c=30;
	static final int d=40;
	
	class InnerClass
	{
		void accept()
		{
			System.out.println("Private varible.." +a);
			System.out.println("Public varible.." +b);
			System.out.println("Static Variable .." +c);
			System.out.println("Static final varible.." +d);
		}
	}
	static class StaticInnerClass
	{
		static void accept()
		{
			System.out.println("Static variable..." +c);
			System.out.println("Static final variable.." +d);
		}
	}
}
public class OutrInnrFirst {

	public static void main(String[] args) {
          Outer o=new Outer();
          Outer.InnerClass oin=o.new InnerClass();
          oin.accept();
          Outer.StaticInnerClass.accept();
		
	}

}

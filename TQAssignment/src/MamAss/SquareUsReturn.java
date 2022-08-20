package MamAss;
/*CRETE A CLS TO PRNT THE AREA OF SQUARE & A RECTANGLE ..THE CLS HAS TWO MTHDS WITH THE SAME NAME BUT
BUT DIFF NO OF PARAMETER..THE MTHDS FOR PRINTING AEA OF RECTANGLE HAS TWO PARAMETERS WHICH ARE LENGTH & BREADTH RESPECTIVELY..
WHILE THE OTHER METHDS FOR PRINTING AREA O SQUARE HAS ONE PARAMETRE WHICH IS SIDE OF SQUARE */

public class SquareUsReturn {
	
	int length,breadth,side;
	static int rectangle,square;
	
    static int calculate(int length, int breadth)
    {
    	rectangle=length*breadth;
    	return rectangle;
    }
    static int calculate(int side)
    {
        square=side*side;
        return square;
    }
	public static void main(String[] args) 
	{
		SquareUsReturn s=new SquareUsReturn();
		System.out.println("Area of Rectangle:" +(calculate(20,30)));
		System.out.println("Area of Square:" +(calculate(10)));
	}

}

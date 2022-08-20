package MamAss;
/*CRETE A CLS TO PRNT THE AREA OF SQUARE & A RECTANGLE ..THE CLS HAS TWO MTHDS WITH THE SAME NAME BUT
BUT DIFF NO OF PARAMETER..THE MTHDS FOR PRINTING AEA OF RECTANGLE HAS TWO PARAMETERS WHICH ARE LENGTH & BREADTH RESPECTIVELY..
WHILE THE OTHER METHDS FOR PRINTING AREA O SQUARE HAS ONE PARAMETRE WHICH IS SIDE OF SQUARE */

public class Square {
	float side;
	float length,breadth;
	
	void area(float side)
	{
		System.out.println("Area of Square is:" +side*side); 
	}
	void area(float length, float breadth)
	{
		System.out.println("Area of rectangle is:" +length*breadth);
	}
	public static void main(String[] args)
	{
        Square s=new Square();
        s.area(12);
       
        Square s1=new Square();
        s1.area(14, 10);
	}

}

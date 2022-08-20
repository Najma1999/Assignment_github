package MamAss;

public class Cycle {
 
	String color;
	String brand;
	int noOfWheels;
	
    Cycle()
	{
	     this("pink","Avon");
	     System.out.println("Default Constructor");
	}
    public Cycle(String color,String brand)
    {
    	this.color=color;
    	this.brand=brand;
    }
	Cycle(int noOfWheels)
	{
		this.noOfWheels=noOfWheels;
	}
	void display()
	{
		System.out.println("color" +color+ " " +"brand" +brand+ " " +"noOfWheels" +noOfWheels);
	}
	public static void main(String[] args) 
	{
        Cycle c=new Cycle();
        Cycle c1=new Cycle("pink","Avon");
        Cycle c2=new Cycle(2);
        c1.display();
        c2.display();
	}

}

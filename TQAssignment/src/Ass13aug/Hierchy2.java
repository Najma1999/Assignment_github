package Ass13aug;

    class TV
    {
    	void display()
    	{
    		System.out.println("TV is on");
    	}
    }
    class Samsung extends TV
    {
    	void display()
    	{
    		super.display();
      	   System.out.println("ABP news channel is on");
        }
    }
    class Videocon extends TV
    {
    	void display()
    	{
    		super.display();
    		System.out.println("Colrs channel is on");
    	}
    }
public class Hierchy2 
{
	public static void main(String[] args) 
	{
          Videocon v=new Videocon();
          v.display();
	}

}

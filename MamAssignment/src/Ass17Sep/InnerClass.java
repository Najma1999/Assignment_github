package Ass17Sep;

public class InnerClass {
	
	private int data=30;
	class Data
	{
		void msg()
		{
			System.out.println("data is.."+data);
		}
	}
	public static void main(String[] args) {
         InnerClass in=new InnerClass();
         InnerClass.Data d= in.new Data();
           d.msg();
	}

}

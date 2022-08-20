package Ass23July;

public class Books {

	int b_id;
	String b_name;
	String b_authorName;
	int price;
	String rating;
	
	public void accept(int b_id,String b_name, String b_authorName, int price, String rating)
	{
		this.b_id=b_id;
		this.b_name=b_name;
		this.b_authorName=b_authorName;
		this.price=price;
		this.rating=rating;
	System.out.println(b_id+" "+b_name+ " " +b_authorName+" "+price);
	giverating(rating);
	}
	private void giverating(String rating)
	{
		System.out.println(rating);
	}
	public static void main(String[] args)
	{
       Books b=new Books();
       b.accept(2, "Java" ,"najma", 230, "Excellent");
	}

}

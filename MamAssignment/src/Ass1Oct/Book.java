package Ass1Oct;

public class Book implements Comparable <Book>{

	int id;
	String name;
	String author;
	int price;
	public Book(int id, String name, String author, int price)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public int compareTo(Book p) 
	{
        if(price> p.price)
        	return 1;
        if(price< p.price)
        	return -1;
        else
		return 0;
	}
	
	
}

package Ass1Oct;

import java.util.Comparator;

public class BookAuthor implements Comparator<Book>{

	@Override
	public int compare(Book bo1, Book bo2) 
	{
   		return bo1.author.compareTo(bo2.author);
	}

	
}

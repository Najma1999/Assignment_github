package Ass1Oct;

import java.util.Comparator;

public class BookName implements Comparator<Book>{

	@Override
	public int compare(Book bk1, Book bk2)
	{
    	return bk1.name.compareTo(bk2.name);
	}

}

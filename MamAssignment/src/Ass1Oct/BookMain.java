package Ass1Oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {

		Book b1=new Book(1,"C","Denis",500);
		Book b2=new Book(1,"C#","John",200);
		Book b3=new Book(1,"Java","Paul",300);
		Book b4=new Book(1,"Sql","Jack",400);
		
		ArrayList<Book> al=new ArrayList<>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		for(int i=0; i<al.size(); i++)
		{
			Book b=al.get(i);
			System.out.println(b.id+ " " +b.name+ " " +b.author+ " " +b.price);
		}
		System.out.println("----------------------------------");
		System.out.println("sorting price");
		
		Iterator<Book> it=al.iterator();
		Collections.sort(al);
		for(Book bk:al)
		{
			System.out.println(bk.id+ " " +bk.name+ " " +bk.author+ " " +bk.price);

		}
		System.out.println("----------------------------");
		System.out.println("sorting book name");
		Collections.sort(al,new BookName());
		for(Book bkn:al)
		{
			System.out.println(bkn.id+ " " +bkn.name+ " " +bkn.author+ " " +bkn.price);

		}
		System.out.println("----------------------------");
		System.out.println("sorting book author");
		Collections.sort(al,new BookAuthor());
		for(Book bka:al)
		{
			System.out.println(bka.id+ " " +bka.name+ " " +bka.author+ " " +bka.price);

		}
			}

}

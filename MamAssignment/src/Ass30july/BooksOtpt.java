package Ass30july;

import java.util.Scanner;

public class BooksOtpt {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Books b=new Books();
	b.set_bookName(" ");
	b.set_bookPrice(0);
	b.set_authorName("");

	 System.out.println("Enter bookName....");
	    b.bookName=sc.next();
	    System.out.println("Enter bookPrice....");
	    b.bookPrice=sc.nextInt();
	    System.out.println("Enter bookAuthor....");
	    b.authorName=sc.next();

	
        System.out.println("BooksName.."  +b.get_bookName());
	    System.out.println("bookPrice.."  +b.get_bookPrice());
	    System.out.println("AuthorName.." +b.get_authorName());
	    
	    
	}

}

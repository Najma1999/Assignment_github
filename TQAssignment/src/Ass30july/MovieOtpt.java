package Ass30july;

import java.util.Scanner;

public class MovieOtpt {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   
		    Movie m=new Movie();
			m.set_movieName(" ");
			m.set_movieCost(0);
			m.set_movieCatgory("");
			
		    System.out.println("Enter movieName....");
		    m.movieName=sc.next();
		    System.out.println("Enter movieCost....");
		    m.movieCost=sc.nextInt();
		    System.out.println("Enter movieCatgory....");
		    m.movieCatgory=sc.next();

		        System.out.println("MovieName.."  +m.get_movieName());
			    System.out.println("MovieCost.."  +m.get_movieCost());
			    System.out.println("MovieCatgory.." +m.get_movieCatgory());
			    
			    
			}

		

	}



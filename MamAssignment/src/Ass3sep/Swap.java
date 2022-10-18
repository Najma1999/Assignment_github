package Ass3sep;

public class Swap {

	public static void main(String[] args) {

		String s1="Najma ";
		String s2="Ramteke";
		
		int i=s1.length();
		s1=s1+s2;
		s2=s1.substring(0, i);
		s1=s1.substring(i);
		System.out.println("s1 swapping...." +s1);
		System.out.println("s2 swapping...." +s2);	
		
	}

}

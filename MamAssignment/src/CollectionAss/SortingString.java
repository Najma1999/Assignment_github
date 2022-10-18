package CollectionAss;

import java.util.ArrayList;
import java.util.Collections;

public class SortingString /*implements Comparable<String>*/{

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("Mango");
		al.add("Orange");
		al.add("Apple");
		al.add("Cherry");
		al.add("Watermelon");
		
		Collections.sort(al);
		for(String sort:al)
		{
			System.out.println(sort);
		}
	}

}

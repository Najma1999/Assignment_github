package CollectionAss;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInteger {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		al.add(89);
		al.add(67);
		al.add(90);
		al.add(34);
		al.add(12);
		
		Collections.sort(al);
		for(int count:al)
		{
			System.out.println(count);
		}
			
	}

}

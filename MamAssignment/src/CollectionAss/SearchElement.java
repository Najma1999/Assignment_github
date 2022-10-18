package CollectionAss;

import java.util.HashMap;
import java.util.Scanner;
//WAP TO SEARCH FOR AN ELEMENT FROM HASHMAP USING KEY
public class SearchElement {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "x");
		hm.put(2, "y");
		hm.put(3, "z");
		
          if(hm.containsKey(9))
          {
                 System.out.println("contains key present");
          }
          else
        	  System.out.println("doesnit contain key ");
	}

}

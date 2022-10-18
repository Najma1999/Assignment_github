package CollectionAss;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveValueHashmap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter name to delet");
        String name=sc.next();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
         hm.put(1, "Naina");
         hm.put(2, "Kavya");
         hm.put(4, "Hina");
         hm.put(3, "Pratha");
         hm.put(6, "Priti");
         hm.put(5, "Priya");
         
         Collection<String> set=hm.values();
         Iterator<String> it=set.iterator();
        		 while(it.hasNext())
        		 {
        			 if(it.next().equals(name))
        			 {
        				 it.remove();
        			 }
        		 }
        		 System.out.println(hm);
	}

}

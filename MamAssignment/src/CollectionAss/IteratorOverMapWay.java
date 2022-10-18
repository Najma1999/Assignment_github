package CollectionAss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorOverMapWay {

	public static void main(String[] args) {

       Map<Integer,String> ma=new HashMap<>();
       ma.put(1, "Amit");
       ma.put(2, "Vijay");
       ma.put(3, "Chintu");
       //1) using for loop iteration over map.entrySet()
       for(Map.Entry<Integer, String> entry:ma.entrySet())
       {
    	   System.out.println("Key.." +entry.getKey()+ "values.." +entry.getValue());
       }
       System.out.println("---------------------------------------------");
       
       //2.) using KeySet() for iteration over keys
       for(Integer i: ma.keySet())
       {
    	   System.out.println("Key......" +i);
       }
       // using values() for iteration over keys
       for(String s: ma.values())
    	   System.out.println("values..." +s);
        System.out.println("---------------------------------------");
        
        //3)  using Iterator
		Iterator<Entry<Integer,String>> it=ma.entrySet().iterator();
	     while(it.hasNext())
	     {
	    	 Map.Entry en=it.next();
	    	 System.out.println("Key.. " +en.getKey()+ "values..." +en.getValue());
	     }
       }

}

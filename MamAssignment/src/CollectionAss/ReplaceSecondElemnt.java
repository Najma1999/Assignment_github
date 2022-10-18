package CollectionAss;

import java.util.ArrayList;

public class ReplaceSecondElemnt {

	public static void main(String[] args) {

		 ArrayList<Integer> al=new ArrayList<Integer>();    
		  al.add(1);
		  al.add(2);
		  al.add(3);
		  al.add(4);
          al.add(5);
          
          int new_al=100;
          al.set(1, 100);
          int num=al.size();
          System.out.println("replace with 100");
          for(int i=0; i<num; i++)
          {
        	  System.out.println(al.get(i));
          }
	}

}

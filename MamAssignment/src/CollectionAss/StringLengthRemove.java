package CollectionAss;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.multi.MultiSliderUI;

public class StringLengthRemove {

	public static void main(String[] args) {
      //  int size=0;

		ArrayList<String> al=new ArrayList<String>();
		  al.add("sunday");
		  al.add("monday");
		  al.add("tuesday");
		  al.add("wednesday");
		  al.add("thursday");
		  al.add("friday");
		  al.add("saturday");
		
		  int largestString =al.size();
		  int index=0;
		  System.out.println("largest string are: ");
		  for(int i=0; i<al.size(); i++)
		  {
			  if(al.get(i).length()>7)
			  {
				  largestString =al.get(i).length();
				  index=i;
				  System.out.println(al.get(i));
			  }
		  }
	}

}

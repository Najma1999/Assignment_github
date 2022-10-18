package Ass8Oct;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
	//	ArrayList<String> all=new ArrayList<String>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(40);
	  System.out.println(al);          
	  Object a[]=al.toArray();      //convert arraylist to arry   (1st way)
	  System.out.println(Arrays.toString(a));
	  
	  //2nd way
	  Integer arr[]=new Integer[al.size()];
	  Integer in[]=al.toArray(arr);
	  for(int i=0; i<in.length; i++)
	  {
		  System.out.println(in[3]);
	  }

	}

}

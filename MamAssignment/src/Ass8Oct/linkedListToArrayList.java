package Ass8Oct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedListToArrayList {

	public static void main(String[] args) {

	LinkedList<String> l=new LinkedList<String>();
	l.add("orange");
	l.add("apple");
	l.add("pear");
	l.add("guava");
	
	List<String> al=new ArrayList<String>(l);
	for(String s:al)
	{
		System.out.println(s);
	}
	
	}

}

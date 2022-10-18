package Ass1Oct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {

		  LinkedList<String> li=new LinkedList();
	        li.add("Mango");
	        li.add("Apple");
	        li.add("Kiwi");
	        li.add("Orangr");
	        
	        li.addFirst("Guava");    ///element at the front of linkedlist
	        li.addLast("Peach");   //element at the end of list
	        li.add("Guava");    // element at specified postion
	        System.out.println("--------------------------");
	        
	        System.out.println(li);
	        li.removeFirst();    // remove first
	        System.out.println(li);
	        System.out.println("-----------------");

	        
	        if(li.contains("Mango"))   //particular elemnt is presnt in arraylist
	        {
	        	System.out.println("present in arralist");
	        }
	        else
	        	System.out.println("not present");
	        //convert linkedlist to arraylist
	        System.out.println("converting linkedlist to arraylist");
	        List<String> lis=new ArrayList<String>(li);
	        for(String s:lis)
	        	System.out.println(s);
	}

}

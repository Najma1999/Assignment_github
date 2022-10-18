package Ass8Oct;

import java.util.Stack;

public class ItemMain {

	public static void main(String[] args) {

		Stack<Item> s=new Stack<Item>(); 
		Item i1=new Item(1,"mango");
		Item i2=new Item(2,"kivi");
		Item i3=new Item(3,"greps");
		Item i4=new Item(4,"apple");	
		
		Stack<Item> st=new Stack<Item>(); 
	    st.add(i1);
	    st.add(i2);
	    st.add(i3);
	    st.add(i4);
	  //  st.push(i2);
	    
	    System.out.println(st);
	    
	    for(int i=0; i<4; i++)
	    {
	       System.out.println(st.pop());
	    }
	    System.out.println(st);
	}
}

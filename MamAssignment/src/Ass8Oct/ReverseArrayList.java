package Ass8Oct;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("hhh");
		al.add("sss");
		al.add("bbb");
		al.add("mmm");
		al.add("ooo");
		
		Collections.reverse(al);
		System.out.println("after reverse");
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}

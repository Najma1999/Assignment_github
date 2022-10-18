package Ass8Oct;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("hhh");
		al.add("sss");
		al.add("bbb");
		al.add("mmm");
		al.add("ooo");
		
		Collections.shuffle(al);
		System.out.println("after shuffle");
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}

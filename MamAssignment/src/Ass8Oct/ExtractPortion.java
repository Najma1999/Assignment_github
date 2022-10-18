package Ass8Oct;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("hhh");
		al.add("sss");
		al.add("bbb");
		al.add("mmm");
		al.add("ooo");
		
		List<String> s=al.subList(0, 3);
		System.out.println(s);
	}

}

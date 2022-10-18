package CollectionAss;

import java.util.HashMap;

public class HashMapRemoveKey {

	public static void main(String[] args) {

		HashMap<Integer,String> hd=new HashMap<Integer,String>();
		hd.put(1, "red");
		hd.put(2, "green");
		hd.put(3, "black");
		hd.put(4, "white");
		hd.put(5, "blue");
		
		System.out.println(hd);
		hd.remove(3);
		System.out.println("-------------------------");
		System.out.println("updated hashmap after remove");
		System.out.println(hd);
	}

}

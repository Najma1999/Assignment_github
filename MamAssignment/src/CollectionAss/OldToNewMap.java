package CollectionAss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class OldToNewMap {

	public static void main(String[] args) {

		HashMap<Integer,String> old=new HashMap<Integer,String>();
		old.put(1, "a");
		old.put(2, "b");
		old.put(3, "c");
		old.put(6, "b");
		old.put(4, "a");
		old.put(5, "a");
	//	System.out.println(old);
		
		String arr[]=new String[old.size()];
		HashMap<String,Integer> newmap=new HashMap<String,Integer>();
		Set<Entry<Integer,String>> s=old.entrySet();
		Iterator<Entry<Integer,String>> it=s.iterator();
		int i=0;
		while(it.hasNext())
		{
			arr[i]=it.next().getValue();
					i++;
		}
		System.out.println(Arrays.toString(arr));
		for(int j=0; j<arr.length; j++)
		{
			int count=1;
			for(int k=j+1; k<arr.length; k++)
			{
				if(arr[k].equals(arr[j]))
				{
					count++;
					arr[k]= " ";
				}
			}
			if(arr[j] != " ")
			{
				newmap.put(arr[j], count);
			}
		}
		System.out.println(newmap);
	}

}

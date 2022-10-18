package CollectionAss;

import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {

		ArrayList<Integer>al=new ArrayList<>(3);
            for(int i=0; i<=50; i++)
            {
            	if(i%2==0)
            	{
            		al.add(i);
            	}
            }
            System.out.println(al);
	}

}

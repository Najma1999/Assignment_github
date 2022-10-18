package CollectionAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StateCapital implements Comparable<StateCapital> {

	String state;
	String capital;
	
		public StateCapital(String state, String capital) 
		{
		  this.state = state;
		  this.capital = capital;
	    }

	//	@Override
		public int compareTo(StateCapital o) 
		{
			return this.capital.compareTo(o.capital);
		}
		public static void main(String []args) {

			StateCapital sc1=new StateCapital("Maharashtra","Mumbai");
			StateCapital sc2=new StateCapital("UtterPradesh" , "Lucknow");
			StateCapital sc3=new StateCapital("Bihar" , "Patna");
			StateCapital sc4=new StateCapital("TamilNadu" , "Chennai");
			StateCapital sc5=new StateCapital("Goa" , "Panji");
			
			ArrayList<StateCapital> al=new ArrayList();
			   al.add(sc1);
			   al.add(sc2);
			   al.add(sc3);
			   al.add(sc4);
			   al.add(sc5);
			   Collections.sort(al);
				  // System.out.println("--------------------");
				   for(StateCapital sort:al)
					{
						System.out.println(sort.capital+ " " +sort.state);
					}
			 
			}
}

	
	
	


package CollectionAss;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetailsMain {

	public static void main(String[] args) {

		EmployeeDetails ed1=new EmployeeDetails(40,"Ramesh","Manager");
		EmployeeDetails ed2=new EmployeeDetails(35,"Om","Hr");
		EmployeeDetails ed3=new EmployeeDetails(45,"Raju","Clerk");

		ArrayList<EmployeeDetails> al=new ArrayList();
             al.add(ed1);
             al.add(ed2);
             al.add(ed3);
             
             //Iterator<EmployeeDetails> it=al.iterator();
             for(int i=0; i<al.size(); i++)
             {
            	 EmployeeDetails e=al.get(i);
            	 System.out.println(e.age+ " " +e.name+ " " +e.designation);
             }
	}

}

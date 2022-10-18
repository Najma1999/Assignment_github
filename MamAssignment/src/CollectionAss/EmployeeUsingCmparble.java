package CollectionAss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeUsingCmparble implements Comparable<EmployeeUsingCmparble>{
	int age;
	String name;
	String Designation;
	public EmployeeUsingCmparble(int age,String name,String Designation)
	{
		this.age=age;
		this.name=name;
		this.Designation=Designation;
	}
	@Override
	public int compareTo(EmployeeUsingCmparble c) 
	  {
	     if(age>c.age)
			return 1;
		if(age<c.age)
			return -1;
		else
			return 0;
		//return this.name.compareTo(o.name);
	  }
	public static void main(String[] args){

		EmployeeUsingCmparble ed1=new EmployeeUsingCmparble(40,"Ramesh","Manager");
		EmployeeUsingCmparble ed2=new EmployeeUsingCmparble(35,"Om","Hr");
		EmployeeUsingCmparble ed3=new EmployeeUsingCmparble(45,"Raju","Clerk");

		ArrayList<EmployeeUsingCmparble> al=new ArrayList();
        al.add(ed1);
        al.add(ed2);
        al.add(ed3);

        for(int i=0; i<al.size(); i++)
        {
        	EmployeeUsingCmparble e=al.get(i);
       	 System.out.println(e.age+ " " +e.name+ " " +e.Designation);
        }
        System.out.println("-------------------------------");
        
     //  Iterator<EmployeeUsingCmparble> i=al.iterator();
		   Collections.sort(al);
       for(EmployeeUsingCmparble e:al)
       {
         	 System.out.println(e.age+ " " +e.name+ " " +e.Designation);
       }
       System.out.println("---------------------");
       for(EmployeeUsingCmparble er:al)
       {
         	 System.out.println(er.age+ " " +er.name+ " " +er.Designation);
       }
	}

			
		}




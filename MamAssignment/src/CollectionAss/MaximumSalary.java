package CollectionAss;

import java.util.ArrayList;
import java.util.Iterator;

class Emp
{
	int salary;
	String name;
	
	public Emp(int salary, String name)
	{
		this.salary = salary;
		this.name = name;
	}
}
public class MaximumSalary {

	public static void main(String[] args) {
        ArrayList<Emp> al=new ArrayList<Emp>();
        al.add(new Emp(100, "AAA"));
        al.add(new Emp(500, "AAA"));  
        al.add(new Emp(900, "AAA"));
        al.add(new Emp(700, "AAA"));
        al.add(new Emp(300, "AAA"));

       // Iterator<Emp> it=al.iterator();
        int maxsalary=0;
        String name=null;
       /* if(it.hasNext())
        {
        	Emp e=it.next();
        	maxsalary=e.salary;
        }*/
        Iterator<Emp> it1=al.iterator();
        while(it1.hasNext())
        {
        	Emp e1=it1.next();
             if(maxsalary<=e1.salary)
             {
            	 maxsalary=e1.salary;
            	 name=e1.name;
             }
        }
        System.out.println("person name is..." +name);
        System.out.println("max salry..." +maxsalary);
	}
}

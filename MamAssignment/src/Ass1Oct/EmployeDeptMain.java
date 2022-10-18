package Ass1Oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeDeptMain {

	public static void main(String[] args) {

		EmpDepartment d1=new EmpDepartment(1,"IT");
		EmpDepartment d2=new EmpDepartment(2,"ME");
		EmpDepartment d3=new EmpDepartment(3,"Civil");
		EmpDepartment d4=new EmpDepartment(4,"Others");
		
		Employee e1=new Employee(11,"AAA",20000,d1);
		Employee e2=new Employee(22,"XXX",50000,d1);
		Employee e3=new Employee(33,"CCC",30000,d1);
		Employee e4=new Employee(44,"DDD",40000,d1);
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		for(int i=0; i<al.size(); i++)
		{
			Employee e=al.get(i);
			System.out.println(e.eId+ " " +e.name+ " " +e.salary);
		}
		System.out.println("employee sorting according to salary");
		Iterator<Employee> it=al.iterator();
		Collections.sort(al);
        for(Employee am:al)
        	System.out.println(am.eId+ " " +am.name+ " " +am.salary);
	}

}

package Ass8Oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Ass1Oct.Employee;

public class DoctorClinicMain {

	public static void main(String[] args) {

		Doctor d1=new Doctor(1,"sharma");
		Doctor d2=new Doctor(2,"varma");
		Doctor d3=new Doctor(3,"bisen");
		Doctor d4=new Doctor(4,"kulkarni");

		DocClinic dc1=new DocClinic(111,"ABC","PuneCh", 4, d1);	
		DocClinic dc2=new DocClinic(112,"XYZ","Mumbai", 6, d2);	
		DocClinic dc3=new DocClinic(113,"MNO","Nagpur", 5, d3);	
		DocClinic dc4=new DocClinic(114,"HIJ","Satara", 7, d4);
		
		ArrayList<DocClinic> al=new ArrayList<>();
        al.add(dc1);
        al.add(dc2);
        al.add(dc3);
        al.add(dc4);
        
//        for(int i=0; i<al.size(); i++)
//        {
//            DocClinic d=al.get(i);
//            System.out.println(d.cId+ "  " +d.cName+ " " +d.location+ " " +d.rating+ " " +d.d);
//        }
        System.out.println(" sorting according to rating");
		Iterator<DocClinic> it=al.iterator();
		Collections.sort(al,new DocRating());
        for(DocClinic dc:al)
        	System.out.println(dc.cId+ " " +dc.cName+ " " +dc.rating+ " " +dc.location+ " "  +dc.d);
        System.out.println("--------------------------------------------------");
      
        System.out.println(" sorting according to location");
		Iterator<DocClinic> itc=al.iterator();
		Collections.sort(al,new DocRating());
        for(DocClinic dc:al)
        	System.out.println(dc.cId+ " " +dc.cName+ " " +dc.rating+ " " +dc.location+ " " +dc.d);


	}

}

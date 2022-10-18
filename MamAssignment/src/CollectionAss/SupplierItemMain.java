package CollectionAss;

import java.util.ArrayList;
import java.util.HashMap;

public class SupplierItemMain {

	public static void main(String[] args) {

//		HashMap<Supplier,SuplierItem> hs=new HashMap<Supplier,SuplierItem>();
		
		Supplier s1=new Supplier(1,"Aman","PuneCh");
		Supplier s2=new Supplier(2,"Ramn","Satara");
		Supplier s3=new Supplier(3,"Aman","Nagpur");
		Supplier s4=new Supplier(4,"Amit","Sangli");
		
		SuplierItem i1=new SuplierItem(11,"Soap",30,s1);
		SuplierItem i2=new SuplierItem(22,"Pen",10,s2);
		SuplierItem i3=new SuplierItem(33,"Shampoo",130,s3);
		SuplierItem i4=new SuplierItem(44,"Brush",40,s4);
		
		HashMap<String,ArrayList<String>> hs=new HashMap<String,ArrayList<String>>();
        ArrayList<SuplierItem>al=new ArrayList<SuplierItem>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);

	}

}

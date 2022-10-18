package Ass8Oct;

import java.util.Comparator;

public class Doctor {
	
	int dId;
	String dName;

	public Doctor(int dId, String dName)
	{
		this.dId = dId;
		this.dName = dName;
	}
	@Override
	public String toString()
	{
		return dId+ " " +dName;
	}
}
class DocClinic {

	int cId;
	String cName;
	String location;
	int rating;
	Doctor d;
	public DocClinic(int cId, String cName, String location, int rating,Doctor d) 
	{
		this.cId = cId;
		this.cName = cName;
		this.location = location;
		this.rating = rating;
		this.d = d;
	}
}

class DocRating implements Comparator <DocClinic>{

	@Override
	public int compare(DocClinic dr1, DocClinic dr2)
	{
    	if(dr1.rating>dr2.rating)
			return -1;
		else if(dr2.rating<dr1.rating)
			return 1;
		else
    		return 0;
	}
}
class DocLocation implements Comparator <DocClinic>{

	@Override
	public int compare(DocClinic dl1, DocClinic dl2) 
	{
		if(dl1.rating>dl2.rating)
			return -1;
		else if(dl2.rating<dl1.rating)
			return 1;
		else
     		return 0;
	}
}

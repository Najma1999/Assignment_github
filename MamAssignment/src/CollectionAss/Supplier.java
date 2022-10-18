package CollectionAss;

public class Supplier {

	int sId;
	String sName;
	String location;
	
	public Supplier(int sId, String sName, String location)
	{
		this.sId=sId;
		this.sName=sName;
		this.location=location;
	}
	public String toString()
	{
		return sId+ " " +sName+ " " +location;
	}
}

package CollectionAss;

public class SuplierItem {

	int iId;
	String iName;
	int price;
	Supplier s;
	
	public SuplierItem(int iId, String iName, int price, Supplier s)
	{
		this.iId=iId;
		this.iName=iName;
		this.price=price;
		this.s=s;
	}
	public String toString()
	{
		return iId+ " " +iName+ " " +price+ " " +s;
	}
}

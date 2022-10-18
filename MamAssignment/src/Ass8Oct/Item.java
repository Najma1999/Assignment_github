package Ass8Oct;

public class Item {

	int iId;
	String iName;
	
	public Item(int iId, String iName) 
	{
		this.iId = iId;
		this.iName = iName;
	}

	@Override
	public String toString() {
		return iId+ " " +iName;
	}
	
	
}

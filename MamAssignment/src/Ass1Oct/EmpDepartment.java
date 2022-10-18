package Ass1Oct;

public class EmpDepartment {

	   int dId;
	   String dName;
	   
	public EmpDepartment(int dId, String dName) 
	   {
		  this.dId = dId;
		  this.dName = dName;
   	   }
	   public void set_dId(int dId)
	   {
		   this.dId=dId;
	   }
	   public int get_dId()
	   {
		   return dId;
	   }
	   public void set_dId(String dName)
	   {
		   this.dName=dName;
	   }
	   public String get_dName()
	   {
		   return dName;
	   }
	@Override
	public String toString()
	{
		return dId+ " " +dName;
	}
	   
}

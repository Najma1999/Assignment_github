package MamAss;

public class PrsnFieldInfo {

	public static void main(String[] args) {

         Person p=new Person();
         p.set_Job("IT");
         p.set_Name("Minal");
         System.out.println(p.get_Job());
         System.out.println(p.get_Name());
         
         PrsnField f=new PrsnField();
         f.set_JobId(101);		 
         f.set_JioningDate("22/03/1999");
         f.set_Profile("Manager");
         System.out.println(f.get_JobId());
         System.out.println(f.get_JioningDate());
         System.out.println(f.get_Profile());
         
         PrsnInformation i=new PrsnInformation();
         i.set_Day("Thursday");
         i.set_Month("April");
         i.set_Year(2000);
         System.out.println(i.get_Day());
         System.out.println(i.get_Month());
         System.out.println(i.get_Year());
	}

}

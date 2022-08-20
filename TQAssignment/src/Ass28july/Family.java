package Ass28july;

public class Family {

	static String fatherName;
	int fatherAge;
	String motherName;
	int motherAge;
	String brotherName;
	int brotherAge;
	String myName;
	int myAge;
//	//int totalMember;
	
	public Family(String fatherName,int fatherAge,String motherName,int motherAge,
			            String brotherName,int brotherAge,String myName,int myAge)
	{
		this.fatherName=fatherName;
	    this.fatherAge=fatherAge;
	    this.motherName=motherName;
	    this.motherAge=motherAge;
	    this.brotherName=brotherName;
	    this.brotherAge=brotherAge;
	     this.myName=myName;
	    this.myAge=myAge;
	 //   this.totalMember=totalMember;
	}
	void display()
	{
		System.out.println("fatherName is...." +fatherName);
		System.out.println("fatherAge is....." +fatherAge) ;
		System.out.println("motherName is...." +motherName);
		System.out.println("motherAge is......" +motherAge);
		System.out.println("brotherName is...." +brotherName);
		System.out.println("brotherAge is......" +brotherAge);
		System.out.println("myName is.........." +myName);
        System.out.println("myAge is..........." +myAge);
	}
	
	public static void main(String[] args) 
	{
         Family f=new Family("Vilas",45,"Rama",40,"Vivek",21,"Najma",23);
         f.display();
        		 
         
	}

}

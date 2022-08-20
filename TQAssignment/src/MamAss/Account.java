package MamAss;
//CRETE A CLS ACCOUNT WITH MEMBER VARIABE LONG ACCOUNT NUMBER STRING CUSTOMER NAME
public class Account {
 static String customerName;
 long accNumber;
 
 public Account()
 {
	System.out.println("I am defulat constructor:");
 }
 public Account(long accNumber,String customerName)
 {
	 System.out.println("I am paremeterized constructor:");
	 this.accNumber=accNumber;
	 this.customerName=customerName;
 }
 void display()
 {
	 System.out.println("ACCOUNT DETAILS:");
	 System.out.println("customerName is....." +customerName);
	 System.out.println("accNumber is..." +accNumber);
	
 }
 public static void main(String[] args) 
 {
	 Account a=new Account(31445678,"Najma");
	 a.display();
 }

}

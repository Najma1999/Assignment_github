package MamAss;
/* CRETE A CLS 'STUDENT' WITH THREE DATA MEMBERS WHICH ARE NAME,AGE,&ADDRESS..
 IT HAS TWO METHODS WITH THE SAME NAME set_Info()...
 FIRST METOD HAS TWO PARAMETERS FOR NAME AND ASSIGHNS THE SAME WHEREAS SECOND METHOD TAKES HAS THREE 
 PARAMETRES WHICH ARE ASSIGNED TO NAME,AGE&ADDRESS RESP...PRINT THE NAME,AGE & ADDRESS               
 */
public class Student {
 
	int age;
	String name,address;
	
	void set_info(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void set_info(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void display()
	{
		System.out.println("name:" +name+ " " +"age:" +age+ " " +"address:" +address);
	}
	public static void main(String[] args) {
                Student s=new Student();
                s.set_info("XYZ", 23);
                s.set_info("XYZ", 23, "pune");
                s.display();
	}

}

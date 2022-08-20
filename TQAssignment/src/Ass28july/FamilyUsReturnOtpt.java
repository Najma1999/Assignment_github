package Ass28july;

public class FamilyUsReturnOtpt {

	public static void main(String[] args) {

		FamilyUsReturn f=new FamilyUsReturn();
		 f.accept();
		
		 int totalMember=f.totalMember();
		 if(totalMember<5)
		 {
			 System.out.println("Family is small");
		 }
		 else
			 System.out.println("Family is big");
	}

}

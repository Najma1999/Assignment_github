package Ass3sep;

public class Split {

	public static void main(String[] args) {

		//int count=0;
		String s="HELLO$WORLD";
		String [] str=s.split("\\$");
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
			//count++;
		}
	}

}

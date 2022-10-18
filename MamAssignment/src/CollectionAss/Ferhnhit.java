package CollectionAss;

import java.util.Scanner;

class Temp
{
	int i=0;
	int  Fahrenheit;
	
	void convert (int temp) throws Exception 
	{
		int arr[]=new int[5];
		Fahrenheit=(temp*(9/5))+32;
	
		if(arr[i]>100)
		{
			/*try
			{
			   throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("Fahrenheit grter than 100");
			}*/
		}
		else
			System.out.println("Fahrenheit..." +arr[i]);
	}
}
public class Ferhnhit {
	
	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter tempreture");
		int temp=0;
		for(int i=0; i<5; i++)
			temp=sc.nextInt();
		Temp t=new Temp();
		t.convert(temp);
	}

}

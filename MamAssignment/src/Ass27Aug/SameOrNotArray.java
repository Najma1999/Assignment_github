package Ass27Aug;
/*WAp to check if elements of an array are same or not it read from front or back*/
public class SameOrNotArray {

	public static void main(String[] args) {
		int arr[]= {2,3,15,15,3,2};

		int count=1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		if(count>1)
		{
			System.out.println("Same");
		}
		else
			System.out.println("Not Same");
	}

}

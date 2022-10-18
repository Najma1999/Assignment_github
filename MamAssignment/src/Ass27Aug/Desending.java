package Ass27Aug;
/* sort the given array in descending order {2,4,6,7,18,12};*/
public class Desending {

	public static void main(String[] args) {

		int arr[]= {2,4,6,7,18,12};
		int temp=0;
		System.out.println("Orginal Array");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		for(int j=0; j<i+1; j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
			System.out.println("--------");
		System.out.println("Descending Array");
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]+ " ");
		}
	}
}


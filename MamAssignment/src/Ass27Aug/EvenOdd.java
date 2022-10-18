package Ass27Aug;
/*Given an  array A[] write a function that segregate even and odd numbers ...
 * the function should put all even numbers first and then odd numbers*/
public class EvenOdd {

	public static void main(String[] args) {
      
		int arr[]= {12,34,45,9,8,90,3};
		System.out.println("Original Array");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		arr=seprateEvenOddNumbers(arr);
		System.out.println("After seprate even odd");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]+ " ");
		}
	}
	public  static int[] seprateEvenOddNumbers(int arr[] ) 
	{
		int left=0;
		int right=arr.length-1;
		for(int j=0; j<arr.length; j++)
		{
			while(arr[left]%2==0)
			{
				left++;
			}
			while(arr[right]%2==1)
			{
				right--;
			}
			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
       return arr;
	}
}

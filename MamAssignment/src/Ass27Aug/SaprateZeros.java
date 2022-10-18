package Ass27Aug;

/* WAP a java prgrm to seprate zeros from non-zeros in an integer? 
 * [12,0,7,0,8,0,3] input array after moving zeros to front [0,0,0,12,7,8,3]*/
public class SaprateZeros {

	public static void main(String[] args) {

		int arr []= {12,0,7,0,8,0,3};
		
	    int len=arr.length-1;
	    for(int i=arr.length-1; i>=0; i--)
	    {
	    	if(arr[i]!=0)
	    	{
	    		arr[len]=arr[i];
                len--;
	    	}
	    }
	    while(len>=0)
	    {
	    	arr[len]=0;
	    	len--;
	    }
	    for(int j=0; j<arr.length; j++)
	    {
	    	System.out.print(arr[j]+ " ");
	    }
		}
		
	}


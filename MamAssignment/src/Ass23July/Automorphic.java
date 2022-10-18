package Ass23July;
import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a no to check:");
    int num=sc.nextInt();
    int count=0;
    
    int square=num*num;
    int temp=num;
    //int sq=num;
    
    while(temp>0)
    {
    	count++;
    	temp=temp/10;
    }
    int lastDigit=(int)(square%(Math.pow(10, count)));
    if(num==lastDigit)
    System.out.println(num+ "is an automorphic no:");
    else
    	System.out.println(num+ "is not automorphic no:");
    
    
	}

}

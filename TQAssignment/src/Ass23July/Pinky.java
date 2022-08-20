package Ass23July;

import java.util.Scanner;

public class Pinky {

	public static void main(String[] args) {
		int num,key,times,r,flag=0;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the No:");
        num=sc.nextInt();
        
        System.out.println("Enter the key digit:");
        key=sc.nextInt();
        
        int temp=num;
        while(temp>0)
        {
        	r=temp%10;
        	if(r==key)
        	{
        		flag++;
        	}
        	temp/=10;
        }
        System.out.println(key+"appears"+" 3 times in"+num);
	}

}

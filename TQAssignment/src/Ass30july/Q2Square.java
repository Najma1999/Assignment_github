package Ass30july;

import java.util.Scanner;

public class Q2Square {
void Square()
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int res=num*num;
	System.out.println(res);
}
//   int square1(int a, int b)
//{
//	return a*b;
//}
	public static void main(String[] args) {
		Q2Square s=new Q2Square();
		s.Square();
	}

}

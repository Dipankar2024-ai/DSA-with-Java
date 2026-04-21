package Patterns;

import java.util.Scanner;

public class SquarePattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(n-j+1);
			}
			System.out.println();
		}
		

	}

}

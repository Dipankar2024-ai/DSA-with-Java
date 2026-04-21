package Patterns;

import java.util.Scanner;

public class ReverseNumberPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			k=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(k);
				k=k-1;
			}
			System.out.println();
		}

	}

}

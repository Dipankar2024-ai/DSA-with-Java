package Patterns;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		char ans;
	
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				ans=(char)('A'+j-1);
				
				System.out.print(ans);
			}
			System.out.println();
		}

	}

}

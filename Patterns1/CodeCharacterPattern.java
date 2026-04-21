package Patterns;

import java.util.Scanner;

public class CodeCharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		char ans;
		
	
		for(i=1;i<=n;i++)
		{
			ans=(char)('A'+i-1);
			
			for(j=1;j<=i;j++)
			{
			  
				
				System.out.print((char)(ans+j-1));
			}
			System.out.println();
		

	}


	}

}

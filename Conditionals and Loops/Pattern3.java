package ConditionalsAndLoops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k=1,m;
		for(i=1;i<=n;i++) {
			
			for(m=1;m<=n-i;m++)
			{
				 System.out.print(" ");
			}
		
           for(j=1;j<=i;j++)
           {
        	   System.out.print(k);
        	   k=k+1;
           }
           System.out.println();
	}
	}

	}



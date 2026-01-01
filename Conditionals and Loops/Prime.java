package ConditionalsAndLoops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=2;
		
		while(d<n) {
			
			if(n%d==0)
			{
				System.out.println("It is not a prime no");
				return;
			}
			d=d+1;
		}
		
		System.out.println("It is a prime no");
		
	}

}

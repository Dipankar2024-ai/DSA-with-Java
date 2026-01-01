package ConditionalsAndLoops;

import java.util.Scanner;

public class SumofEvenBwtn1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<n)
		{
			if(i%2==0) {
				sum=sum+i;
			}
			i=i+1;
		}
		System.out.println(sum);
		

	}

}

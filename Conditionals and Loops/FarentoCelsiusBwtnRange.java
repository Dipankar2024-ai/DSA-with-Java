package ConditionalsAndLoops;

import java.util.Scanner;

public class FarentoCelsiusBwtnRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		int i=start;
		int cel;
		while(i<=end)
		{
			
			cel=(5*(i-32))/9;
			System.out.println(i+"--->"+cel);
			
			i=i+step;
		}
		

	}

}

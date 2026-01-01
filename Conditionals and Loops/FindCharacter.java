package ConditionalsAndLoops;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine().charAt(0);
		
		int a =c;
		if(a>=65 && a<=90) {
			System.out.println("1");
		}
		else if (a>=97 && a<=122) {
		System.out.println("0");}
	
	   else {
		   System.out.println("-1");
	  }

}
}

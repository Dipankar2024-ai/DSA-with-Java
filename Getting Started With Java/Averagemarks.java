package GettingStartedWithJava;
import java.util.*;

public class Averagemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name= sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int avg=(a+b+c)/3;
		
		System.out.println(name);
		System.out.println(avg);
		

	}

}

package GettingStartedWithJava;

import java.util.Scanner;

public class FarhToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter farenhite value: ");
		int f=sc.nextInt();
		int c=(5*(f-32))/9;
		System.out.println("Celsius Value : "+ c);
		

	}

}

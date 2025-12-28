package GettingStartedWithJava;

import java.util.Scanner;

public class Greaterbtwn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		boolean greater= ((a>b) && (a>c));
		System.out.println(greater);
		

	}

}

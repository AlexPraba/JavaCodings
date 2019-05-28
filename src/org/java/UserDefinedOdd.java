package org.java;

import java.util.Scanner;

public class UserDefinedOdd {

	public static void main(String[] args) {
System.out.println("Please enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if (a%2==1) {
	System.out.println("Odd");
}
else{
	System.out.println("Ever");
}
	}
}

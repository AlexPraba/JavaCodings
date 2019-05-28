package org.java;

import java.util.Scanner;

public class UserPrimeNumber {

	public static void main(String[] args) {
System.out.println("Please Enter the number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), count = 0;
for (int i = 2; i <= a/2; i++) {
	if (a%2==0) {
		count = 1;
		break;
	}
}
if (count==0) {
	System.out.println("Prime Number");
}
else{
	System.out.println("Composite Number");
}
	}

}

package org.java;

import java.util.Scanner;

public class UserSum {

	public static void main(String[] args) {
System.out.println("Please enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), i = 0, sum = 0;
while(a>0){
	i = a%10;
	sum = sum+i;
	a = a/10;
}
System.out.println(sum);
	}

}

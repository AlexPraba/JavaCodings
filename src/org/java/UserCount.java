package org.java;

import java.util.Scanner;

public class UserCount {

	public static void main(String[] args) {
System.out.println("Please enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), i = 0, count = 0;
while(a>0){
	a = a/10;
	count = count+1;
}
System.out.println(count);
	}

}

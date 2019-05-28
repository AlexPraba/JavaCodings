package org.java;

import java.util.Scanner;

public class UserReverse {

	public static void main(String[] args) {
System.out.println("Please enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int i = 0, j = 0;
while(a>0){
	i = a%10;
	j = (j*10)+i;
	a = a/10;
}
System.out.println(j);
	}

}

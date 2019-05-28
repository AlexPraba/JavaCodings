package org.java;

import java.util.Scanner;

public class UserAmstrong {

	public static void main(String[] args) {
System.out.println("Please enter number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt(), i = 0, j = 0, n = 0;
n = a;
while(a>0){
	i = a%10;
	j = j+(i*i*i);
	a = a/10;
}
if(n==j){
	System.out.println("Amstrong Number");
}
else{
	System.out.println("Not an Amstrong Number");
}
	}

}

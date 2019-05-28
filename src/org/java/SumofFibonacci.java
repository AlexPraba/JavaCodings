package org.java;

public class SumofFibonacci {

	public static void main(String[] args) {
int a = 0, b = 1, c = 0, sum = 0;
for (int i = 0; i <= 10; i++) {
	c = a + b;
	if (c<=10) {
		System.out.println(c);
		sum = sum + c;
		a = b;
		b = c;
		
	}
}
System.out.println("------");
System.out.println(sum);
System.out.println("------");
	}
}

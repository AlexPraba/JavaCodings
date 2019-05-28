package org.java;

public class SimplePrime {

	public static void main(String[] args) {
int a = 3, count = 0;
for (int i = 2; i <=a/2; i++) {
	if (a%2==0) {
		count = 1;
		break;
	}
}
if (count==0) {
	System.out.println("Prime Number");
}
else {
	System.out.println("Composite Number");
}
	}

}

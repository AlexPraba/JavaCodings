package org.java;

public class MaxandMinfromArray {

	public static void main(String[] args) {
int a[] = {12, 78, 89, 45, 23, 9}, x;
for (int i = 0; i < a.length; i++) {
	for (int j = 1+i; j < a.length; j++) {
		if (a[i]>a[j]) {
			x = a[i];
			a[i] = a[j];
			a[j] = x;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
System.out.println("Max "+a[a.length-1]);
System.out.println("Min "+a[0]);
	}

}

package org.java;

public class SimpleCount {

	public static void main(String[] args) {
int a = 2134, i = 0, count = 0;
while(a>0){
	a = a/10;
	count = count+1;
}
System.out.println(count);
	}
}

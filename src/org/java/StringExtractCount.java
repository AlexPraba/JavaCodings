package org.java;

public class StringExtractCount {

	public static void main(String[] args) {
String a = "AlexisPrabaHaran#@gmail.com1234";
int upper = 0, lower = 0, number = 0, special = 0;
for (int i = 0; i < a.length(); i++) {
	char c = a.charAt(i);
	if (c >= 'A' && c <= 'Z') {
		upper++;
	}
	else if (c >= 'a' && c <= 'z') {
		lower++;
	}
	else if (c >= '0' && c <= '9') {
		number++;
	}
	else {
		special++;
	}
}
System.out.println(upper+ " "+lower+" "+number+" and "+special);
	}

}

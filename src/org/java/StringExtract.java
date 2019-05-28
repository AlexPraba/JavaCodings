package org.java;

public class StringExtract {

	public static void main(String[] args) {
String a = "AlexisPrabaHaran#@gmail.com1234", upper = "", lower = "", number = "", special = "";
for (int i = 0; i <a.length(); i++) {
	char c = a.charAt(i);
	if (c >= 'A' && c <= 'Z') {
		upper = upper+c;
	}
	else if (c >= 'a'&& c <='z') {
		lower = lower+c;
	}
	else if (c >= '0' && c <= '9') {
		number = number+c;
	}
	else {
		special = special+c;
	}
}
System.out.println(upper+" "+lower+" "+number+" and "+special);
	}
}

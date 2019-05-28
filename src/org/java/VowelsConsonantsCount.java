package org.java;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
String s = "welcometojava";
int vowels = 0, consonants = 0;
for (int i = 0; i <= s.length()-1; i++) {
	char c = s.charAt(i);
	if (c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
		vowels++;
	}
	else{
		consonants++;
	}
	}
System.out.println(vowels);
System.out.println(consonants);
	}

}

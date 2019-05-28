package org.java;

public class VowelsConsonants {

	public static void main(String[] args) {
String s = "welcometojava", vowels = "", consonants = "";
for (int i = 0; i <=s.length()-1; i++) {
	char c = s.charAt(i);
	if (c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
		vowels = vowels+c;
		
	}
	else{
		consonants = consonants+c;
	}
}
System.out.println(vowels);
System.out.println(consonants);
	}

}

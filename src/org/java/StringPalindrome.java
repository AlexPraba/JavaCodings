package org.java;

public class StringPalindrome {

	public static void main(String[] args) {
String st = "malayalam", rev = "";
for (int i = st.length()-1; i >=0; i--) {
	char ch = st.charAt(i);
	rev = rev + ch;
}
if (rev.equals(st)) {
System.out.println("This String is Palindrome");	
}
else{
	System.out.println("This isn't a Palindrome");
}
	}

}

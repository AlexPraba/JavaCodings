package org.java;

public class SimplePalindrome {

	public static void main(String[] args) {
int a = 181, i = 0, j = 0, n = 0;
n = a;
while(a>0){
	i = a%10;
	j = (j*10)+i;
	a = a/10;
}
if(n==j){
	System.out.println("Palindrome Number");
}
else{
	System.out.println("Not a Palindrome Number");
}
	}

}

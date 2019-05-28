package org.java;

public class SimpleAmstrong {

	public static void main(String[] args) {
int a = 153, i = 0, j = 0, n = 0;
n = a;
while(a>0){
	i = a%10;
	j = j+(i*i*i);
	a = a/10;
}
if (n==j) {
	System.out.println("Amstrong Number");
}
else{
	System.out.println("Not an Amstrong Number");
}
	}

}

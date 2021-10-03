//9)factorial of given  number by using recur
package com.te.myapp;

public class Factorial {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		int num = 20;
		System.out.println("Factorial of " + num + " is" + factorial(20));
	}
}

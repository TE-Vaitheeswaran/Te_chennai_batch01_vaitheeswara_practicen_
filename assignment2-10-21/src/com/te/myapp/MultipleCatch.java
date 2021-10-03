// 12) exception using try and multiple catch
package com.te.myapp;

public class MultipleCatch {
int ival=15;
	public static void main(String[] args) {
		
	
	MultipleCatch ref=null;
	
	
        
		try {
			int a=50;
			int b=0;
			int c=a/b;
			System.out.println(c);
			System.out.println(ref.ival);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Arithematic exception handled");
		}catch (NullPointerException e) {
			System.out.println("Null pointer");
		}
	}
}

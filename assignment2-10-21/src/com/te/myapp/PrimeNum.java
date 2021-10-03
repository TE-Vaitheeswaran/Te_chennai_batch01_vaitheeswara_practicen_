package com.te.myapp;

//4) prime or not
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		//int num = 8;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
		boolean prime = false;
		for (int i = 2; i < num; i++) {
			if (num %i  == 0) {
				prime = false;
				break;
			} else {
                prime=true;
				
			}
		}
		if(prime) {
			System.out.println(num+"is a prime ");
		}else {
			System.out.println(num+"is not a prime");
		}
		
	}
}

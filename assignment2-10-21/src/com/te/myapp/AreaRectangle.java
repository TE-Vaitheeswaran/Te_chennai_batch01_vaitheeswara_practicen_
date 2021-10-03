//6)find out the area of the rectangule
package com.te.myapp;
import java.util.Scanner;

public class AreaRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle ");
		int length = scan.nextInt();
		System.out.println("Enter the breadth of the rectangle ");
		int breadth = scan.nextInt();
        int perimeter=2*(length+breadth);
		int area = length * breadth;
		System.out.println("the area of the rectangle is :" + area);
		System.out.println("the perimeter of the rectangle is :" + perimeter);
	}
}

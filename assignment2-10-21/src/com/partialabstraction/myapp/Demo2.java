package com.partialabstraction.myapp;

public class Demo2 extends Demo1{
	
	public void display() {
		 System.out.println("display method displayed");
	 }
	public static void main(String[] args) {
		Demo2 ref= new Demo2();
		ref.ctrl();
		ref.display();
	}

}

package com.bagavathi.myapp;

import java.io.File;

public class CreateFolder {
 public static void main(String[] args) {
	
	 File ref=new File("D:\\java\\jsp ");
	 boolean bval=ref.exists();
	 
	 if (bval==false) {
		 ref.mkdir();
		 System.out.println(" The folder is created");
	 } else {
		 System.out.println("The folder alredy exist");
	 }
}
	
}

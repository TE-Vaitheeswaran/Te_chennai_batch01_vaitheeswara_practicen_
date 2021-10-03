package com.bagavathi.myapp;

import java.io.File;
import java.io.IOException;

public class DeleteFolder {

	public static void main(String[] args) {
		 File ref=new File("D:\\java\\jsp");
		 boolean bval=ref.exists();
		 
		 if (bval==true) {
			 ref.delete();
			 System.out.println(" The folder is deleted");
		 } else {
			 System.out.println("The folder is not exist");
		 }
}
}

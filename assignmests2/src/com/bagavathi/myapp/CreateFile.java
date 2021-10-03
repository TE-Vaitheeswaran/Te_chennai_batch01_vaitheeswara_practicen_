package com.bagavathi.myapp;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		File ref =new File("D:\\java\\jsp\\vai.txt");
		boolean b=ref.exists();
		
		if(b==false) {
			try {
				ref.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("the file created");	
		} else {
			System.out.println("the file is already exists");
		}
	}

}

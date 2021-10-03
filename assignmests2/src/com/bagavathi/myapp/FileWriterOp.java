package com.bagavathi.myapp;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOp {
	
	 public static void main(String[] args) {
			
		FileWriter ref = null;
		try {
			ref = new FileWriter("D:\\java\\jsp\\vai.txt");
			ref.write("jason momo is a actordad");
			//ref.writef
			ref.write("\n");
			ref.write(" he is acted in see web searies da ");
			System.out.println("file write complete");
			ref.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

	}
	



	
package com.bagavathi.myapp;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderOp {

	public static void main(String[] args) {
		FileReader ref =null;
		try {
		ref =new FileReader("D:\\java\\jsp\\vai.txt");
		int val =ref.read();
		while(val !=-1){
			System.out.print((char)val);
			
		}
		}catch(Exception e) {
			System.out.println("Read the opearation failed");
		}finally {
			try {
				ref.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

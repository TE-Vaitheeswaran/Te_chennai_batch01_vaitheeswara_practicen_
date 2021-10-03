//17
package com.userdefinedexception.myapp;

public class UserExeceptionTest {
public static void main(String[] args) {
		
		try {
			UserException ref = new UserException("raja is a java developer");
			throw ref;
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}
}

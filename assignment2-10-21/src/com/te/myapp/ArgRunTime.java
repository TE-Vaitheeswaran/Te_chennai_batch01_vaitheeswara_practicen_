// 3)find the number of  argument provided at runtime
package com.te.myapp;

public class ArgRunTime {
public static void main(String[] args) {
	
	System.out.println("Arguments passed at runtime");
	
	for(int i=0; i<args.length;i++) {
		System.out.println("argument"+i+"="+args[i]);
	}
}
}

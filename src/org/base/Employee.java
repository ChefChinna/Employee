package org.base;

public class Employee {

	public static void main(String[] args) {
		
		String s= "Welcome to java class";
		System.out.println(s);
		
		String s1="Welcome to java class";
		System.out.println(s1);
		
		boolean equals= s.equals(s1);
				System.out.println(equals);
		
		String s2="Hi";
		System.out.println(s2);
		
		String concat =s2.concat(s);
		System.out.println(concat);
		
		String trim =s1.trim();
		System.out.println(trim);
				
	}
}

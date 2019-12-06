package org.test;

public class Emp {
public static void main(String[] args) {
	String emp = "aaaa";
	try {
		if(!emp.equals("bbbb")) 
			throw new ExpUserDef();
	}
		catch(ExpUserDef e) {
			e.printStackTrace();
		}
	
	finally {
		System.out.println("User Defined Exception");
	}
	}
	
}


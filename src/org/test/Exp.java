package org.test;

public class Exp {
	public void demothrow() throws ArithmeticException  {
	try{
	     int a=5,b=0;
		int c=a/b;
	      throw new ArithmeticException("Divide by zero");
	   }
	catch(ArithmeticException e)
	{
	System.out.println("dont divide by zero:");
	e.printStackTrace();
	throw e;
	}
	//System.out.println("Printed:");
}
	
	public static void main(String[] args) throws ArithmeticException {
	
		Exp e = new Exp();
		try {
			e.demothrow();
			throw new Exception();
		}
		catch(Throwable g)
		{
			System.out.println("Exception received in main");
		}
		finally {
			System.out.println("Done well!");
		}

	}
	}



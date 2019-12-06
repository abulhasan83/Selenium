package org.test;

public class ExpUserDef extends Exception{
	@Override
		public String getMessage() {
			String ms = " Emp Not Found";
			return ms;
		}
}
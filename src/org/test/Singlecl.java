package org.test;

public class Singlecl {
static Singlecl e = null;

public static Singlecl getIn()
{
	if(e==null)
	{
		e = new Singlecl();
		
	}
	System.out.println(e);
	return(e);
	
}
public void getId() {
	System.out.println("The id is 001");
}
public static void main(String[] args) {
	Singlecl f = getIn();
	System.out.println(f);
	
}

}

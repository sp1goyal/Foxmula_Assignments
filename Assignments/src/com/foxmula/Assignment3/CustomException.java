package com.foxmula.Assignment3;


class myException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	myException(String s){
	super(s);
	}
}

public class CustomException {

	static void function(int n) throws myException{
		int b=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				b++;
		}
		
		if(b==2 && n%2==1)
		{
			throw new myException("Number is Invalid"); 
		}
		else
		{
			System.out.println("There is no exception found");
		}
	}
	
	public static void main(String args[])
	{
		try {
			
			function(3);
			function(6);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

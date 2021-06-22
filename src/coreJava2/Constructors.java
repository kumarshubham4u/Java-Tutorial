package coreJava2;

public class Constructors {
	
	
	public Constructors()
	{
		
		System.out.println("I am default constructor");
	}

	
	public Constructors(int a,int b)
	{
		
		System.out.println("I am parameterised constructor containing:  "+ a +" and " +b);
	}

	
	public static void main(String[] args) {
		
		
		Constructors c1=new Constructors();
		Constructors c2=new Constructors(8, 9);
		
	}
}

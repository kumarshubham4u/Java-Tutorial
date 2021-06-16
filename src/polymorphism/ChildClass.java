package polymorphism;

public class ChildClass extends ParentClass {
	
	
	
	public static void main(String[] args) {
		
		
		ChildClass cc=new ChildClass();
		cc.gears();
		cc.brakes();
		cc.tires();
		cc.colour();
		
	}
	
	
	public void colour() {
		
		System.out.println("Car colour is : " + colour);
	}
	
	//Method Overriding
	public void brakes() {
		
		System.out.println("Child class brakes");
	}
	
	
}

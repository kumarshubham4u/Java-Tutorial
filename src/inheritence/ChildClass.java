package inheritence;

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
	
	
}

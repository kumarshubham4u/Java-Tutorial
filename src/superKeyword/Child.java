package superKeyword;

public class Child extends Parent {

	String name = "child";
	
	public Child() {
		
		super();//Calling constructor of parent class. This should always be written first else it throws error
		System.out.println("I am Child constructor");
	}

	public void getStringData() {
		
		System.out.println("I am: "+super.name);
		System.out.println("I am: "+ name);
		super.getData();//calling parent method with same method name
	}
	
	
	public void getData() {
		
		
		System.out.println("I am child method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.getStringData();
		c.getData();
	}
	
	
}

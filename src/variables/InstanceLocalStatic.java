package variables;

public class InstanceLocalStatic {

	String name;// Instance variable
	String address;// Instance variable
	static String country;
	static String city = "Chaibasa";// static variable
	static int i = 1;// static variable is shared through the class

	static {
		//this is static block, used to initialise static variables
		country = "India";
	}

		

	InstanceLocalStatic(String name, String address) {

		// name and address defined under the constructor are local variable
		this.name = name;//this.instance_variable=local variable
		this.address = address;
		i++;

		System.out.println(i);

	}

	public void getData() {

		System.out.println(name + " lives in: " + address + "," + city);
	}

	public static void staticMethod() {

		System.out.println(city);// static method can only contain static variable
		System.out.println(country);
	}

	public static void main(String[] args) {

		InstanceLocalStatic obj = new InstanceLocalStatic("Shubham", "Nimdih");
		InstanceLocalStatic obj1 = new InstanceLocalStatic("Kushal", "Police Line");
		obj.getData();
		obj1.getData();
		staticMethod();// calling static method

	}

}

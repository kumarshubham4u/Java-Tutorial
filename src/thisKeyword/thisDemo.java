package thisKeyword;

public class thisDemo {
	
	int a=4;
	
	
	public void getData() {
		int a=2;
		System.out.println(a);//calls the variable whose scope is within getData method
		System.out.println(this.a);//calls variable defined for the class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td=new thisDemo();
		td.getData();
	}

}

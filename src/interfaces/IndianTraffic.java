package interfaces;

public class IndianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic ct=new IndianTraffic(); //Similar to WebDriver driver =new ChromeDriver();
		ContinentalTraffic cnt= new IndianTraffic();
		IndianTraffic it=new IndianTraffic(); //For implementing the concrete methods of the same class
		
		
		ct.greenGo();
		ct.redStop();
		ct.yellowFlash();
		cnt.trainSymbol();
		it.walkSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Green light on");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red light on");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow light on");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
		System.out.println("Train is coming, Wait!!!");
		
	}
	
	
	public void walkSymbol() {
		
		System.out.println("Wait, People are walking!!");
	}
	


}

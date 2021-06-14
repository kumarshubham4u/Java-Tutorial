package abstractClass;

public class Indigo extends ParentAircraft {
	
	public static void main(String[] args) {
		
		ParentAircraft pa=new Indigo();
		pa.engine();
		pa.cockpit();
		pa.bodyColour();
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Paint it blue!");
	}

}

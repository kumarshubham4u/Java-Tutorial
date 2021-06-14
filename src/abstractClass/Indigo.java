package abstractClass;

public class Indigo extends ParentAircraft {
	
	public static void main(String[] args) {
		
		Indigo ind=new Indigo();
		ind.engine();
		ind.cockpit();
		ind.bodyColour();
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Paint it blue!");
	}

}

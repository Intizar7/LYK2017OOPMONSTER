package tr.org.linux.kamp.monster;

public class Dragon extends Monster implements Flyable,Scarer{

	public String breathFire() {
		return "ARRRRRRRRGGGGGHHHGGGGG";
	}

	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String frighten() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void canMakeYouScared() {
		// TODO Auto-generated method stub
		
	}

	
}

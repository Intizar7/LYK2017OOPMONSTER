package tr.org.linux.kamp.monster;

public class MonsterApplication {

	public static void main(String[] args) {
		
		Dragon dragon = new Dragon();
		Vampire vampire = new Vampire();
		
		dragon.breathFire();
		dragon.fly();
		vampire.bite();
}
	
}

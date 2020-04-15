package visitor;

public class Infection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Creature theThing = new Creature();
		System.out.println("Hello, I'm " + theThing.creatureType + " made from " + theThing.body);
		System.out.println("Time to get started");
		theThing.genesis();
		
	}

}

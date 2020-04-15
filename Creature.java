package visitor;

public class Creature implements Context {
	String body = "metamorphic living substance.";
	String creatureType = "parasitic lifeform";
	@Override
	public void genesis() {
		// TODO Auto-generated method stub
		
		Evolution genetics = new EvolutionVisitor();
		genetics.evolve();
		
		
		
	}

}

package visitor;

public class EvolutionVisitor implements Evolution {

	@Override
	public void evolve() {
		// TODO Auto-generated method stub
		SeedState spore = new SeedState();
		
	}
	
	@Override
	public void evolve(boolean levelUpgrade) {
		if (levelUpgrade == true) {
			InfantState factory = new InfantState();	
		}
		
		
	}

	@Override
	public void evolve(String level) {
		// TODO Auto-generated method stub
		if(level.contains("ready")) {
			AdultState platform = new AdultState();
		}
		
	}



}

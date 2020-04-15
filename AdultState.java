package visitor;

public class AdultState implements State {

	public AdultState(){
		this.run();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		firstStep();
		System.out.println("Platforms ready for spore release.");
		int days = 0;
		while (days < 10) {
			System.out.println("Releasing spores." + " Day:"+ days );
		days++;
		
		}
		System.out.println("Chambers are empty.");
	
	}

	@Override
	public void metamorphosis() {
		// TODO Auto-generated method stub
		System.out.println("Parasite's lifepsan is over.");
		System.out.println("****************************END OF EVOLUTION LEVEL**********************************************************");
	}

	@Override
	public void firstStep() {
		System.out.println("Platform grown");
	}

	@Override
	public boolean stateActionDone() {
		// TODO Auto-generated method stub
		this.action();
		return true;
	}

	@Override
	public void evolutionType() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Level: a launchpad for the spores.");
		System.out.println("Tools: Platforms to help the spores to get caught by the passing wind.\n ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.evolutionType();
		boolean ready =stateActionDone();
		if(ready == true) {
			metamorphosis();
			}
	}



}

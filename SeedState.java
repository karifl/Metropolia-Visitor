package visitor;

public class SeedState implements State {

	
	public SeedState(){
		this.run();
	}


	@Override
	public void action() {
		// TODO Auto-generated method stub
		this.firstStep();
		System.out.println("Spore connected to a host plant.");
		int days =0;
		while (days < 10) {
			System.out.println("Stealing the nutrients from the host." + " Day:"+ days );
		days++;
		
		}
	}

	@Override
	public void metamorphosis() {
		// TODO Auto-generated method stub
		System.out.println("Morphing a chamber in order to begin spore production.");
		System.out.println("****************************END OF EVOLUTION LEVEL**********************************************************");
		Evolution genetics = new EvolutionVisitor();
		genetics.evolve(true);
	}

	@Override
	public void firstStep() {
		System.out.println("Connecting to the host");
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean stateActionDone() {
		// TODO Auto-generated method stub
		this.action();
		return true;
	}

	@Override
	public void evolutionType() {
		System.out.println();
		System.out.println( "Level: Spore seeking a host to connect.");
		System.out.println("Tools: Sticky hairs for catching into a host, capability to drain life from the host \n ");
		// TODO Auto-generated method stub
		
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

package visitor;

public class InfantState implements State{

	public InfantState(){
		this.run();
	}

	@Override
	public void action() {
		firstStep();
		// TODO Auto-generated method stub
		System.out.println("Spore production started.");
		int days =0;
		while (days < 10) {
			System.out.println("Producing spores in the chamber." + " Day:"+ days );
		days++;
		
		}
		System.out.println("Spore production reaching the maximum limit. .");
	}

	@Override
	public void metamorphosis() {
		// TODO Auto-generated method stub
		System.out.println("Begins to form suitable platforms in order to launch the spores to the environment.");
		System.out.println("****************************END OF EVOLUTION LEVEL**********************************************************");
		Evolution genetics = new EvolutionVisitor();
		genetics.evolve("ready");
	}

	@Override
	public void firstStep() {
		System.out.println("Chamber ready for production");
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
		System.out.println( "Level: sporefactory forming new spores from the nutrients of the host.");
		System.out.println("Tools: Chambers for spore production, pods ready to open as platforms \n ");
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

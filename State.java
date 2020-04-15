package visitor;

public interface State {
	public void run();
	public void evolutionType();
	public void action();
	public void metamorphosis();
	public void firstStep();
	public boolean stateActionDone();
	
}

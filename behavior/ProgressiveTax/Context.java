package ProgressiveTax;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public double executeStrategy(double income){
		return this.strategy.execute(income);
	}
}

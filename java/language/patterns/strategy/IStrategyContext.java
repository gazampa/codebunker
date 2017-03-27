package patterns.strategy;
public class IStrategyContext{
	IStrategy strategy;

	public void behave(){
		strategy.behaviour();
	}

	public void setStrategy(IStrategy strat){
		strategy = strat;
	}

	public IStrategy getStrategy(){
		return strategy;
	}



}
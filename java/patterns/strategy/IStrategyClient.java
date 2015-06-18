import patterns.strategy.*;
public class IStrategyClient{

	public static void main(String[] args){

		IStrategy A = new IStrategyConcreteA();
		IStrategy B = new IStrategyConcreteB();

		IStrategyContext context = new IStrategyContext();
		context.setStrategy(A);
		context.behave();
		context.setStrategy(B);
		context.behave();

	}
}
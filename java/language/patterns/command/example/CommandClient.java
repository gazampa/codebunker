import patterns.command.example.StockCommands;
import patterns.command.example.BuyStockCommand;
import patterns.command.example.Agent;
public class CommandClient{

	public static void main(String args[]){
		StockCommands commands = new StockCommands();
		BuyStockCommand bsc = new BuyStockCommand(commands);
		BuyStockCommand bsc1 = new BuyStockCommand(commands);
		BuyStockCommand bsc2 = new BuyStockCommand(commands);
		BuyStockCommand bsc3 = new BuyStockCommand(commands);
		BuyStockCommand bsc4 = new BuyStockCommand(commands);
		BuyStockCommand bsc5 = new BuyStockCommand(commands);
		Agent agent = new Agent();
		agent.placeOrder(bsc);

	}

}

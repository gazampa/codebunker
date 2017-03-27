package patterns.command.example;
public class BuyStockCommand implements Command{
	private StockCommands commands;
	public BuyStockCommand(StockCommands request){
		commands = request;
	}

	public void execute(){
		commands.buy();
	}
}

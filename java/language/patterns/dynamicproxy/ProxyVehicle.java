package dynamicproxy;
public class ProxyVehicle implements IVehicle{

	private IVehicle v;

	public ProxyVehicle(IVehicle vehicle){
		this.v = vehicle;
	} 

	public void start(){
		System.out.println("Entering Proxy Start");
		v.start();
		System.out.println("Exiting Proxy Start");
	}

	public void move(){
		System.out.println("Entering Proxy Moving");
		v.move();
		System.out.println("Exiting Proxy Moving");
	}

	public void stop(){
		System.out.println("Entering Proxy Stop");
		v.stop();
		System.out.println("Exiting Proxy Stop");
	}

}

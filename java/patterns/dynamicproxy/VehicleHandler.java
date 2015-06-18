package dynamicproxy;
import java.lang.reflect.*;

public class VehicleHandler implements InvocationHandler{

	private IVehicle v;

	public VehicleHandler(IVehicle v){ this.v=v; }

	public Object invoke(Object proxy, Method m, Object[] args)
				throws Throwable{
		System.out.println("Vehicle Handler : Invoking " + m.getName());
		return m.invoke(v, args);
	}
}

import dynamicproxy.IVehicle;
import dynamicproxy.Car;
import dynamicproxy.ProxyVehicle;
import dynamicproxy.VehicleHandler;
import java.lang.reflect.*;
public class Client{

	public static void main(String[] args){

		Car car = new Car("Audi");
		car.start();
		car.move();
		car.stop();

		IVehicle proxCar = new ProxyVehicle(car);
		proxCar.start();
		proxCar.move();
		proxCar.stop();

		ClassLoader cl = IVehicle.class.getClassLoader();
		IVehicle v = (IVehicle) Proxy.newProxyInstance(cl, new Class[] {IVehicle.class }, new VehicleHandler(car));
		v.start();
		v.move();
		v.stop();
	}

}

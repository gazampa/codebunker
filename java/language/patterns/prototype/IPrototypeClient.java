import patterns.prototype.*;
public class IPrototypeClient{

	public static void main(String[] args){
		IPrototypeConcrete one = new IPrototypeConcrete("A");
		System.out.println(one.getId() + " : " + one);
		try{
			IPrototypeConcrete two = (IPrototypeConcrete)one.cloneit();
			//two.setId("B");
			System.out.println(two.getId() + " : " + two );
			System.out.println(one.getId() + " : " + one);
		}catch (CloneNotSupportedException cnsxe){
			System.out.println("Cloning Not Supported : " + cnsxe);
		}
	}



}
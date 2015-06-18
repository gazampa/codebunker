abstract class PrototypeFactory implements Cloneable{

	abstract void prototypeFactory(int x);
	abstract void printValue();

	public Object clone() throws CloneNotSupportedException{
		PrototypeFactory copy = (PrototypeFactory) super.clone();
		return copy;
	}

}
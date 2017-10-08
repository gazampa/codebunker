package patterns.prototype;
public interface IPrototype extends Cloneable{
	Object cloneit() throws CloneNotSupportedException;
}
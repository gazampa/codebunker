//Provide an alternate implementation of the following class (a thunk) that uses no conditional logic.
//For extra credit, make it thread-safe.

	abstract class Thunk<T> {
	  private boolean evaluated;
	  private T value;

	  public T get() {
	    if (!evaluated) {
	      value = compute();
	      evaluated = true;
	    }
	    return value;
	  }
	  abstract protected T compute();
	}
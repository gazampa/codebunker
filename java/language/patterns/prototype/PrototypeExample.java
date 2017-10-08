public class PrototypeExample{

	private PrototypeFactory example;

	public PrototypeExample( PrototypeFactory example ){
		this.example = example;
	}

	public PrototypeFactory makeCopy() throws CloneNotSupportedException{
		return (PrototypeFactory) this.example.clone();
	}

	public static void main( String[] args ){

		try{
			int num = 1000;
			PrototypeFactory temp = null;
			PrototypeFactory prot = new ConcretePrototypeFactory(1000);
			PrototypeExample pe = new PrototypeExample(prot);

			for ( int i = 0;i < 10; i++ ) {
				temp = pe.makeCopy();
				temp.prototypeFactory(i*num);
				temp.printValue();
			}

		}catch( CloneNotSupportedException csne ){
			csne.printStackTrace();
		}

	}

}
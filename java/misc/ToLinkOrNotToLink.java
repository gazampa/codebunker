
public class ToLinkOrNotToLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	boolean templates = false;
	boolean orders = false;
	boolean assets = false;

	if (templates){
		System.out.println("TEMPLATES");
		if ( orders || ( assets && !orders) )
		System.out.println("back to top");
	}

	if (orders){
		System.out.println("ORDERFORMS");
		if (assets)
			System.out.println("back to top");
	}

	if (assets){
	System.out.println("ASSETS");
	}

	System.out.println("back to top");

	}
}

import annotate.Testing;
import annotate.IsAWebService;

public class AnyClass implements Cloneable{

public AnyClass(){}

//Usage

	@Testing
	public void method1(){
		System.out.println("Method Execute");
	}

	@Testing
	public void method2(){
		System.out.println("Method Execute");
	}

	@IsAWebService(value="This is a Remote Method / Web Service",location="http://ackappdev.brandconstructionkit.com/testwebservice1/")
	public void method3(){
		System.out.println("method 1 : ");
	}

	public void method4(){
		System.out.println("method 2 : ");
	}

	public void method5(){
		System.out.println("method 3 : ");
	}

	@IsAWebService(value="This is a Remote Method / Web Service",location="http://ackappdev.brandconstructionkit.com/testwebservice2/")
	public void method6(){
		System.out.println("method 4 : ");
	}

	public Object clone(){
			try{ return super.clone(); }
			catch(Exception e){ throw new Error();}
	}

}
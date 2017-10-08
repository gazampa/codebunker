import java.lang.annotation.*;
import java.lang.reflect.Method;
import annotate.Testing;

public class Main_Harness{

	public static void main(String[] args) throws Exception {

		  AnyClass vr = new AnyClass();

		  Class vrrt = Class.forName("AnyClass");
		  AnyClass vrrtvrrt = ( AnyClass ) vrrt.newInstance();
          AnyClass vrrtatrrt = ( AnyClass ) vr.clone();

	      for (Method m : Class.forName("AnyClass").getMethods()) {

	         if (m.isAnnotationPresent(Testing.class)) {
	             System.out.println("Testing "+m.getName());
	         }
	      }
	}
}
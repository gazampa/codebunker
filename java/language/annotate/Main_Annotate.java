import java.lang.reflect.*;
import annotate.IsAWebService;

public class Main_Annotate{

public static void main(String args[]){

		try{
			Object testObject = Class.forName("AnyClass").newInstance();
            Method [] methods = testObject.getClass().getDeclaredMethods();
            for(Method m : methods) {
				IsAWebService myAnnotation = m.getAnnotation(IsAWebService.class);
				if (myAnnotation!=null){
					System.out.println( m.getName() + " " + myAnnotation.value()+ " " +myAnnotation.location() );
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
}
import java.util.ArrayList;

class DebugJSPSyntax{

	public static void main(String[] args){

		ArrayList<String> templateGroups = new ArrayList<String>();
		templateGroups.add("1");
		templateGroups.add("2");

		if ( templateGroups!=null ){
			if( templateGroups.size()>0 ){
				for (String templateGroup : templateGroups){
					  System.out.println("\r\n");
					System.out.println("     i got some template groups\r\n");

				}
			}
		}

	}

}
import java.text.SimpleDateFormat;
import java.util.Date;

public class spaceReplace{

	public static void main(String[] args){

	Date date = null;//new Date();

	System.out.println(stringTest(getDateString(date,"MM/dd/yyyy")));



	}

    public static String getDateString(Date date, String dateFormat) {
        if(date != null && stringTest(dateFormat)) {
            SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
            return formatter.format(date).toString();
        }
        return "";
    }

    public static boolean stringTest(String pString) {
        if (pString == null || pString.equals("")) {
            return false;
        } else {
            return true;
        }
    }


}
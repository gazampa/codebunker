import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormatFunction {
    public static void main(String[] args) {
	Date now = new Date();
	Locale currentLocale = new Locale("en_US");
	SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy_HH:mm", currentLocale);
	StringBuilder buff = new StringBuilder();

	buff.append(formatter.format(now));
	buff.append("_");
	buff.append("templateID");
	buff.append("_");
	buff.append("HQAccNum");
	buff.append("_");
	buff.append("userName");
	System.out.println( buff.toString() );

    }
}
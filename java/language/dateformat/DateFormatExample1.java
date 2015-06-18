import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormatExample1 {
    public static void main(String[] args) {
		Date today;
		String result;
		SimpleDateFormat formatter;
		Locale currentLocale = new Locale("en_US");

		formatter = new SimpleDateFormat("MM-dd-yy_HH:mm", currentLocale);
		today = new Date();
		result = formatter.format(today);
		System.out.println("Locale: " + currentLocale.toString());
		System.out.println("Result: " + result);

    }
}
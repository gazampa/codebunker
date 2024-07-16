import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTests{


	public static void main(String[] args){

		final DateTimeZone chiTz = DateTimeZone.forID("America/Chicago");
        final DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z");

		String date1  = "2014-05-12T18:00:00Z";
		String date2 = "2014-05-12T18:54:56Z";

		DateTime dt1 = new DateTime(date1);
		DateTime dt2 = new DateTime(date2);

		log(fmt.parseMillis(fmt.print(dt1))); //.withZone(DateTimeZone.forID("America/Chicago"))
		log(dt2);

		dt1.isBefore(dt2);

	}

	private static void log(Object obj){
		System.out.println(obj.toString());
	}

}
package appTraining;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TestLegacyDateTime {

	public static void main(String[] args) {

		Date myDate = new Date();
		System.out.println(myDate);
		myDate.setTime(0);
		System.out.println(myDate);
		
		SimpleDateFormat sdf1;
		sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2;
		sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date myBirthDay = Date.from(Instant.parse("1978-02-09T08:35:00-03:00"));
		System.out.println(myBirthDay);
		
		Date myDate2 = sdf1.parse("01/01/1981", new ParsePosition(0));
		System.out.println(myDate2);
		
		Date myDate3 = sdf2.parse("01/01/1981 12:34:56", new ParsePosition(0));
		System.out.println(myDate3);
	}
}
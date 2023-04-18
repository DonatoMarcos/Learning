package appTraining;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		
		Date date1 = Date.from(Instant.parse("2021-02-09T08:30:00Z"));
		System.out.println(date1);
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		calendar1.add(Calendar.HOUR_OF_DAY, 4);
		date1 = calendar1.getTime();
		System.out.println(date1);

		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2);
		date2 = date2.plusHours(4);
		System.out.println(date2);
		
	}

}

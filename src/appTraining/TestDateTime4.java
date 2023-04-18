package appTraining;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class TestDateTime4 {

	public static void main(String[] args) {

		LocalDate date01 = LocalDate.parse("2023-04-14");
		LocalDateTime date02 = LocalDateTime.parse("2023-04-14T12:10:00");
		Instant date03 = Instant.parse("2023-04-14T12:10:00-03:00");
		System.out.println("For LocalDate:");
		System.out.println("Day: = " + date01.getDayOfMonth());
		System.out.println("Month: = " + date01.getMonth());
		System.out.println("Year: = " + date01.getYear());
		System.out.println("\nFor LocalDateTime:");
		System.out.println("Day: = " + date02.getDayOfMonth());
		System.out.println("Month: = " + date02.getMonth());
		System.out.println("Year: = " + date02.getYear());
		System.out.println("Hour: = " + date02.getHour());
		System.out.println("Minute: = " + date02.getMinute());
		System.out.println("Second: = " + date02.getSecond());
		System.out.println("\nFor Instant:");
		//System.out.println("Day: = " + date03.get(ChronoField.DAY_OF_MONTH));
		//System.out.println("Month: = " + date03.get(ChronoField.MONTH_OF_YEAR));
		//System.out.println("Year: = " + date03.get(ChronoField.YEAR));
		//System.out.println("Hour: = " + date03.get(ChronoField.HOUR_OF_DAY));
		//System.out.println("Minute: = " + date03.get(ChronoField.MINUTE_OF_HOUR));
		//System.out.println("Second: = " + date03.get(ChronoField.SECOND_OF_MINUTE));
		System.out.println("TimeZone: = "+ date03.atZone(ZoneId.of("Zulu")));
		LocalDateTime date04 = LocalDateTime.ofInstant(date03, ZoneId.of("America/Sao_Paulo"));
		System.out.println(date04.getYear());
		System.out.println(date01 +", "+ date01.minusDays(7));
		System.out.println(date02 +", "+ date02.minusYears(7));
		System.out.println(date03 +", "+ date03.minus(20,ChronoUnit.DAYS));
		
		System.out.println("\nTest duration for LocalDate");
		Duration time1 = Duration.between(date01.atStartOfDay(), date01.minusDays(7).atStartOfDay());
		System.out.println("Duration time in days: "+time1.toDays());
		System.out.println("Duration time in minutes: "+time1.toMinutes());
		
		System.out.println("\nTest duration for LocalDateTime");
		Duration time2 = Duration.between(date02, date02.minusDays(7));
		System.out.println("Duration time in days: "+time2.toDays());
		System.out.println("Duration time in minutes: "+time2.toMinutes());
		
		System.out.println("\nTest duration for Instant");
		Duration time3 = Duration.between(date03, date03.minus(7,ChronoUnit.DAYS));
		System.out.println("Duration time in days: "+time3.toDays());
		System.out.println("Duration time in minutes: "+time3.toMinutes());
		

		System.out.println("\nConverting 1000 days to seconds: "+Duration.ofDays(1000).toSeconds());

		System.out.println(LocalDateTime.now(ZoneId.of("America/Lima")));
	}
}



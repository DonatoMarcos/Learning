package appTraining;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestDateTime1 {

	public static void main(String[] args) {

		LocalDate date01 = LocalDate.now();
		System.out.println("Local Date: "+date01);

		LocalDateTime date02 = LocalDateTime.now();
		System.out.println("Local Date & Time: "+date02);
		
		Instant date03 = Instant.now();
		System.out.println("UTC Time: "+date03);

		LocalDate date04 = LocalDate.parse("2022-01-01");
		System.out.println("Local Date from text: "+date04);

		LocalDateTime date05 = LocalDateTime.parse("2022-01-01T00:00:00");
		System.out.println("Local Date Time from text: "+date05);

		Instant date06 = Instant.parse("2022-01-01T00:00:00-03:00");
		System.out.println("Local Date from text: "+date06);

		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date07 = LocalDate.parse("01/01/1980",format1);
		System.out.println("Customized Local Date from text: "+date07);

		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		LocalDateTime date08 = LocalDateTime.parse("01/01/1980 00:00:01.001", format2);
		System.out.println("Customized Local Date Time from text: "+date08);
		
		LocalDate date09 = LocalDate.of(2020, 12, 12);
		System.out.println("Local Date based on day-month-year: "+date09);
		
		LocalDateTime date10 = LocalDateTime.of(2022, Month.APRIL, 1, 1, 1);
		System.out.println("Local Date and time based on day-month-year: "+date10);

	}
}
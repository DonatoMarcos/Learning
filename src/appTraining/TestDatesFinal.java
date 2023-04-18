package appTraining;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDatesFinal {

	public static void main(String[] args) {

		// ---------------------------------
		System.out.println("\nGet timers from now:");
		LocalDate date01 = LocalDate.now();
		LocalDateTime date02 = LocalDateTime.now();
		Instant date03 = Instant.now();
		Date date04 = new Date();

		System.out.println("LocalDate: " + date01);
		System.out.println("LocalDateTime: " + date02);
		System.out.println("Instant: " + date03);
		System.out.println("Date: " + date04);

		// ---------------------------------
		System.out.println("\nGet timers from text:");
		LocalDate date05 = LocalDate.parse("2020-01-01");
		LocalDateTime date06 = LocalDateTime.parse("2020-01-01T01:23:45");
		Instant date07 = Instant.parse("2020-01-01T01:23:45Z");
		Date date08 = Date.from(date07);

		System.out.println("LocalDate: " + date05);
		System.out.println("LocalDateTime: " + date06);
		System.out.println("Instant: " + date07);
		System.out.println("Date: " + date08);

		// ---------------------------------
		System.out.println("\nGet timers in special format:");
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd / MM / yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd / MM / yyyy - HH:mm:ss");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ssZ").withZone(ZoneId.of("Z"));
		SimpleDateFormat format4 = new SimpleDateFormat("dd / MM / yyyy - HH:mm:ss");

		LocalDate date09 = LocalDate.parse("02 / 02 / 2022", format1);
		LocalDateTime date10 = LocalDateTime.parse("02 / 02 / 2022 - 01:23:45", format2);
		Date date15 = format4.parse("02 / 02 / 2022 - 01:23:45", new ParsePosition(0));

		System.out.println("LocalDate: " + date09);
		System.out.println("LocalDateTime: " + date10);
		System.out.println("Date: " + date15);

		// ---------------------------------
		System.out.println("\nPrint timers in special format:");
		Instant date11 = Instant.parse("2023-09-02T08:45:00Z");
		LocalDate date12 = LocalDate.ofInstant(date11, ZoneId.of("America/Sao_Paulo"));
		LocalDateTime date13 = LocalDateTime.ofInstant(date11, ZoneId.of("America/Sao_Paulo"));

		System.out.println("LocalDate: " + date12.format(format1));
		System.out.println("LocalDateTime: " + date13.format(format2));
		System.out.println("Instant: " + format3.format(date11));

		// ---------------------------------
		System.out.println("\nPrint timers in special format:");
		LocalDate date16 = LocalDate.of(2022, 04, 04);
		LocalDateTime date17 = LocalDateTime.of(2022, 04, 04, 21, 22, 00);

		System.out.println("LocalDate: " + date16.format(format1));
		System.out.println("LocalDateTime: " + date17.format(format2));

	}

}

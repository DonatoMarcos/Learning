package appTraining;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestDateTime3 {

	public static void main(String[] args) {

		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date01 = LocalDate.parse("14/04/2023",format1);
		System.out.println("\nLocal Date (Parsed to ISO): "+date01);
		System.out.println("Local Date (Special Format): "+date01.format(format1));
		System.out.println("Local Date (Special Format): "+format1.format(date01));

		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime date02 = LocalDateTime.parse("14/04/2023 19:44", format2);
		System.out.println("\nLocal Date Time (Parsed to ISO): "+date02);
		System.out.println("Local Date (Special Format): "+date02.format(format2));
		System.out.println("Local Date (Special Format): "+format2.format(date02));

		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm Z").withZone(ZoneId.systemDefault());
		Instant date03 = Instant.parse("2023-04-14T19:44:00Z");
		System.out.println("\nGlobal Date with TimeZone (Parsed to ISO): "+date03);
		System.out.println("Global Date (Special + zone Format): "+format3.format(date03));

		DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant date04 = Instant.parse("2023-04-14T19:44:00Z");
		System.out.println("\nGlobal Date with TimeZone (Parsed to ISO): "+date04);
		System.out.println("Global Date (Special no zone Format): "+format4.format(date04));

	}
}
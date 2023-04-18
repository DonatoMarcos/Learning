package appTraining;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTime2 {

	public static void main(String[] args) {

		System.out.println("Converting ISO -> Local and vice-versa");
		
		for (String s: ZoneId.getAvailableZoneIds())
			System.out.println(s);
		
		LocalDate d01 = LocalDate.parse("2022-01-01");
		LocalDateTime d02 = LocalDateTime.parse("2022-01-01T01:01:00");
		Instant d03 = Instant.parse("2022-01-01T01:01:00Z");
		
		LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.of("America/Sao_Paulo"));
		System.out.println("GMT Date: "+d03);
		System.out.println("SP Date: "+d04);

		LocalDateTime d05 = LocalDateTime.ofInstant(d03, ZoneId.of("America/Sao_Paulo"));
		System.out.println("GMT Time: "+d03);
		System.out.println("SP Time: "+d05);
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd_MM_yyyy HH@mm@ss");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd_MM_yyyy HH@mm@ssZ").withZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println("Formatted Local SP Date: "+d04.format(f1));
		System.out.println("Formatted Local SP Time: "+d05.format(f2));
		System.out.println("Formatted Global Time: "+f3.format(d03));
		
		
		System.out.println("Portugal Time");
		Instant d06 = Instant.parse("2023-01-01T00:00:00Z");
		Instant d07 = Instant.parse("2023-07-01T00:00:00Z");
		
		// Java takes into account the daylight time - great!!
		LocalDateTime d08 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime d09 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));
		System.out.println("d06: "+d06);
		System.out.println("d08: "+d08);
		System.out.println("d07: "+d07);
		System.out.println("d09: "+d09);
		
		ZonedDateTime d10 = d07.atZone(ZoneId.of("Portugal"));
		System.out.println(d10);
		ZonedDateTime d11 = d06.atZone(ZoneId.of("Portugal"));
		System.out.println(d11);
}
}
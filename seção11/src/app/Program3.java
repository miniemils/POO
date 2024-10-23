package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {

		// como converter data-hora global, informando o timezone, para data-hora local,
		// e como obter dados de uma data-hora local
		
		LocalDate d04 = LocalDate.parse("2004-03-04");
		LocalDateTime d05 = LocalDateTime.parse("2004-03-04T13:20:07");
		Instant d06 = Instant.parse("2004-03-04T01:20:07Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("d06 = " + r1);
		System.out.println("d06 = " + r2);
		System.out.println("d06 = " + r3);
		System.out.println("d06 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());
		
	}

}

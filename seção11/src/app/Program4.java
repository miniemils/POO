package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		
		// para fazer calculos com data-hora, por exemplo:
		// pegar um objeto data-hora, somar ou subtrair um tempo e, assim, obter um novo objeto
		// ou calcular a duração entre duas data-horas
		
		LocalDate d04 = LocalDate.parse("2004-03-04");
		LocalDateTime d05 = LocalDateTime.parse("2004-03-04T13:20:07");
		Instant d06 = Instant.parse("2004-03-04T01:20:07Z");
		
		LocalDate pastWeeekLocalDate = d04.minusDays(7);
		LocalDate nextWeeekLocalDate = d04.plusDays(7);
		System.out.println("d04 = " + pastWeeekLocalDate);
		System.out.println("d04 = " + nextWeeekLocalDate);
		
		LocalDateTime pastWeeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeeekLocalDateTime = d05.plusDays(7);
		System.out.println("d05 = " + pastWeeekLocalDateTime);
		System.out.println("d05 = " + nextWeeekLocalDateTime);
		
		Instant pastWeeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("d06 = " + pastWeeekInstant);
		System.out.println("d06 = " + nextWeeekInstant);

		Duration t1 = Duration.between(pastWeeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration tt1 = Duration.between(pastWeeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeeekInstant);
		System.out.println("t1 = " + t1.toDays());
		System.out.println("tt1 = " + tt1.toDays());
		System.out.println("t2 = " + t2.toDays());
		System.out.println("t3 = " + t3.toDays());
		System.out.println("t4 = " + t4.toDays());
		
	}

}

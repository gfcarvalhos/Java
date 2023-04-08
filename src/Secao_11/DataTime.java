package Secao_11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTime {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2023-01-01");
		Instant d5 = Instant.parse("2023-01-01T01:30:26-03:00");
		
		LocalDate d6 = LocalDate.parse("08/03/2023", fmt1);
		LocalDateTime d7 = LocalDateTime.parse("09/03/2023 11:26", fmt2);
		LocalDateTime d8 = LocalDateTime.parse("10/02/2023 11:26", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d9 = LocalDate.of(2023, 05, 8);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		
		//Convertendo data-hora para string

		System.out.println("-----------------");
		System.out.println(d6.format(fmt1));
		System.out.println(fmt2.format(d7));
		
		//Considerando o horario do sistema do computador
		
		Instant d10 = Instant.parse("2023-03-10T10:30:09Z");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d10 = " + fmt3.format(d10));
		
		//Convertendo data-hora global para local
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d10, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d10, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(r1.getDayOfMonth());
	}

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf1.parse("04/08/2024");
		Date y2 = sdf2.parse("04/08/2024 18:15:20");
		Date y3 = Date.from(Instant.parse("2024-08-04T18:15:20Z"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(1L);
		Date x4 = new Date(1000L * 60l * 60L * 5L);
		
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("y3 = " + y3);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("-------------------------"); // horário do brasil
		System.out.println("y1 = " + sdf1.format(y1));
		System.out.println("y2 = " + sdf2.format(y2));
		System.out.println("y3 = " + sdf2.format(y3));
		System.out.println("x1 = " + sdf2.format(x1));
		System.out.println("x2 = " + sdf2.format(x2));
		System.out.println("x3 = " + sdf2.format(x3));
		System.out.println("x4 = " + sdf2.format(x4));
		System.out.println("-------------------------"); // horário de greenwich
		System.out.println("y1 = " + sdf3.format(y1));
		System.out.println("y2 = " + sdf3.format(y2));
		System.out.println("y3 = " + sdf3.format(y3));
		System.out.println("x1 = " + sdf3.format(x1));
		System.out.println("x2 = " + sdf3.format(x2));
		System.out.println("x3 = " + sdf3.format(x3));
		System.out.println("x4 = " + sdf3.format(x4));
		
	}

}

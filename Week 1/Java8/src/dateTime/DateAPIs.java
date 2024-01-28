package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAPIs {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2023, 12, 31);
		
		System.out.println(date1.isLeapYear());
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.plusMonths(20));
		System.out.println(date1.withYear(2000));
		System.out.println(date1.getDayOfYear());
		
		LocalDate date3 = LocalDate.now();
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.of(1947,9,15);
		System.out.println(date4);
		
		String str = "1990-10-15";
		LocalDate date5 = LocalDate.parse(str);
		System.out.println(date5);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str2 = "12-01-2024";
		LocalDate date6 = LocalDate.parse(str2, formatter);
		System.out.println(date6);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	
	}

}

package main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sDF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sDF.format(date));
		
		System.out.println();
		LocalTime localTime=LocalTime.of(10,40,13);
		System.out.println(localTime);
		System.out.println(localTime.plusHours(2));
		System.out.println(localTime.plusMinutes(20));
		System.out.println(localTime.plusSeconds(10));
		System.out.println();
		
		LocalDate localDate=LocalDate.of(2044,2,4);
		System.out.println(localDate.isLeapYear());
		
		LocalDateTime  localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		
	}

}

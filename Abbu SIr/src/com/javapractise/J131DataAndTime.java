package com.javapractise;
import java.time.*;

public class J131DataAndTime {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(2021,02, 12);
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getHour());
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
	}

}

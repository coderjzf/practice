package com.jzf.java8;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.instant());
		System.out.println(clock.millis());
		System.out.println(clock.getZone());

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(LocalDate.of(2017, 3, 3));
		System.out.println(LocalDate.now(clock));

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(LocalTime.of(10, 5, 6));
		System.out.println(LocalTime.now(clock));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime from = LocalDateTime.of(2017, 1, 1, 1, 1, 1);
		LocalDateTime to = LocalDateTime.of(2017, 12, 12, 23, 59, 59);
		Duration duration = Duration.between(from, to);
		System.out.println(duration.toDays());
		System.out.println(duration.toHours());
	}
}

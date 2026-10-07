package com.rays.dates;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate cDate = LocalDate.of(1999, 04, 18);

		Period p = Period.between(cDate, date);

		System.out.println("Year = " + p.getYears());
		System.out.println("Month = " + p.getMonths());
		System.out.println("Days = " + p.getDays());
	}
}

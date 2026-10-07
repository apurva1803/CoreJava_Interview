package com.rays.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

public static void main(String[] args) throws ParseException {
		
		String s = "07-10-2026";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}

package com.assignments.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {

		Date d = new Date();

		SimpleDateFormat date = new SimpleDateFormat("EEE MMM dd hh:mm:ss Z yyyy");
		SimpleDateFormat myFormat1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat myFormat2 = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat myFormat3 = new SimpleDateFormat("dd EEE MMM yyyy");

		try {
			Date dateFormat = date.parse(d.toString());
			String format1 = myFormat1.format(dateFormat);
			String format2 = myFormat2.format(dateFormat);
			String format3 = myFormat3.format(dateFormat);

			System.out.println(dateFormat);
			System.out.println("YYYYMMDD format: " + format1);
			System.out.println("MM/dd/yy format: " + format2);
			System.out.println("dd EEE MMM yyyy format: " + format3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

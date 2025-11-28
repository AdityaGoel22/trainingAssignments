package trainingd7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) throws ParseException {

//		Date currentDate = new Date();
//
//		System.out.println(currentDate);
//
//		Date newDate = new Date(2003 - 1900, 04, 22);
//		System.out.println(newDate);
//
//		System.out.println(currentDate.compareTo(newDate));
//
//		System.out.println(currentDate.getDate() + 3);
//
//		Date age = new Date(currentDate.getYear() - newDate.getYear() - 1900,
//				currentDate.getMonth() - newDate.getMonth(), currentDate.getDate() - newDate.getDate());
//		System.out.println(age.getYear() + 1900);
//
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		System.out.println(sdf1.format(currentDate));
//
//		String dd = "22-05-2003 08:30:45";
//		Date d = sdf1.parse(dd);
//		System.out.println(d);
//		
//
//
//		
//		
////		java.util.Date utilDate = new java.util.Date();
//		java.sql.Date sqld = new java.sql.Date(currentDate.getTime());
//		System.out.println(sqld);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
//		System.out.println(sdf.format(currentDate));
//		
//		SimpleDateFormat sdf2= new SimpleDateFormat("dd-MM-ddddd");
//		String str = "15-08-2025";
//		Date d2 = sdf2.parse(str);
//		System.out.println(d2);
//		java.sql.Date sdate = new java.sql.Date(d2.getTime());
//		
//		java.sql.Date slDate = java.sql.Date.valueOf("2024-11-21");
//		
////		java.util.Date utilDate = java.util.Date(sqld.getTime());
//		
//		
//		java.sql.Date sqlDate2 = java.sql.Date.valueOf("2025-02-25");
//		
//		String strr = sqlDate2.toString();
//		
//		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
//		
//		System.out.println(s1, parseObject(str));
		
		
//		
//		//LocalDate
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
//		
//		LocalDate mydate = LocalDate.of(2025, 06, 23);
//		System.out.println(mydate);
//		
//		System.out.println(today.plusDays(4));
//		System.out.println(today.minusDays(5));
//		System.out.println(today.isAfter(mydate));
//		
//		LocalDate dob = LocalDate.of(2003, 05, 22);
//		Period p = Period.between(dob, today);
//		System.out.println("My age is " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days");
		
//		//LocalTime
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		LocalTime t1 = LocalTime.of(22, 30);
//		System.out.println(t1);
//
//		System.out.println(time.getHour());
//		System.out.println(time.getMinute());
//		System.out.println(time.getSecond());
//		
//		// use isBefore isAfter
//		
//		
//		//converting string to localtime
//		
//		String time1 = "11:30:20";
//		
//		LocalTime converted = LocalTime.parse(time1);
//		System.out.println(converted);
//		
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
//		System.out.println(df.format(time));
//		
//		System.out.println(LocalTime.MIN);
//		System.out.println(LocalTime.MAX);
//		System.out.println(LocalTime.NOON);
//		System.out.println(LocalTime.MIDNIGHT);
//		
		
		//Local DateTime
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(2025, 04, 26, 21, 45);
		System.out.println(dt1);
		
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
		
		String str = "2023-07-14T22:13:45";
		
		LocalDateTime  convert = LocalDateTime.parse(str);
		System.out.println(convert);
		
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfYear());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getYear());
		
//		String str1 = "2023-07-14 22:13:45 a";
		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
		System.out.println(df1.format(convert));
	}
}

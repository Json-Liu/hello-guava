package com.joda;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月5日
 ** @Version 1.0
 ***/
public class JodaDemo {
	public static void main(String[] args) {
		//test_getWeek();
		//test();
		//System.out.println(getTime(2016, 8, 22).toString());
		/*System.out.println(DateTime.now().getMonthOfYear());
		System.out.println(getDate("2018-09-22".split("-")));
		System.out.println(getDate("09-22".split("-")));
		System.out.println(getDate("22".split("-")));*/
		
		System.out.println(getTime("10:30:25".split(":")));
		System.out.println(getTime("10:30".split(":")));
		System.out.println(getTime("22".split(":")));
		System.out.println(DateTime.now().toDate());
	}
	private static void test(){
		DateTime strToDateTime = strToDateTime("08-09", "MM-dd");
		System.out.println(strToDateTime);
	}
	private static void test_getWeek() {
		DateTime dateTime = strToDateTime("2016-08-05 12:00:00", "yyyy-MM-dd HH:mm:ss");
		String nowStr = DateTime.now().toString("yyyy-MM-dd");
		System.out.println(nowStr.equals(dateTime.toString("yyyy-MM-dd")));
		System.out.println(DateTime.now().plusDays(- DateTime.now().getDayOfWeek()).toString("yyyy-MM-dd")+"到"+DateTime.now().plusDays(- DateTime.now().getDayOfWeek()).plusDays(6).toString("yyyy-MM-dd"));
	}
	   private static Date getDate(String[] datetime) {
			if(datetime.length == 1){
				return DateTime.now().withDayOfMonth(Integer.valueOf(datetime[0])).toDate();
			}
			if(datetime.length == 2){
				return DateTime.now()
						.withMonthOfYear(Integer.valueOf(datetime[0]))
						.withDayOfMonth(Integer.valueOf(datetime[1])).toDate();
			}
			if(datetime.length == 3){
				return DateTime.now()
						.withYear(Integer.valueOf(datetime[0]))
						.withMonthOfYear(Integer.valueOf(datetime[1]))
						.withDayOfMonth(Integer.valueOf(datetime[2])).toDate();
			}
			return DateTime.now().toDate();
		}
	   private static Date getTime(String[] datetime) {
			if(datetime.length == 1){
				return DateTime.now().withHourOfDay(Integer.valueOf(datetime[0])).toDate();
			}
			if(datetime.length == 2){
				return DateTime.now()
						.withHourOfDay(Integer.valueOf(datetime[0]))
						.withMinuteOfHour(Integer.valueOf(datetime[1])).toDate();
			}
			if(datetime.length == 3){
				return DateTime.now()
						.withHourOfDay(Integer.valueOf(datetime[0]))
						.withMinuteOfHour(Integer.valueOf(datetime[1]))
						.withSecondOfMinute(Integer.valueOf(datetime[2])).toDate();
			}
			return DateTime.now().toDate();
		}
	/**
    * 将相应字符串格式的时间转换为DateTime
    * @param dateTime
    * @param pattern
    * @return
    */
   public static DateTime strToDateTime(String dateTime,String pattern){
       DateTime result = new DateTime();
       DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
       result = formatter.parseDateTime(dateTime);
       return result;
   }
}

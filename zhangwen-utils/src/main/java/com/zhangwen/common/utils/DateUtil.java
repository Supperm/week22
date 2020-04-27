package com.zhangwen.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateUtil {

	//根据出生日期算年龄
	public static int getBirthday(Date date) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(date);
		int b_year = c.get(Calendar.YEAR);
		int b_month = c.get(Calendar.MONTH);
		int b_day = c.get(Calendar.DAY_OF_MONTH);
		
		int age = year - b_year;
		if(month < b_month) {
			age--;
		}
		if(month == b_month && day < b_day) {
			age--;
		}
		
		return age;
	}
	
	//返回传入日期的月末
	public static Date getEndMonth(Date date) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		Date begin = getBeginMonth(calendar.getTime());
		
		calendar.setTime(begin);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}
	
	//返回传入日期的月初
	public static Date getBeginMonth(Date date) {
		int i1 = date.getMonth()-1;
		date.setMonth(i1);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	//随机产生一个在beginDate 和endDate 的随机日期
	public static Date randomDate(Date beginDate,Date endDate) {
		int i1 = beginDate.getMonth()-1;
		beginDate.setMonth(i1);
		int i2 = endDate.getMonth()-1;
		endDate.setMonth(i2);
		long l1 = beginDate.getTime();
		long l2 = endDate.getTime();
		if(l1>l2) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		Random r = new Random();
		long t = (long) ((Math.random() * (l2-l1)) + l1);
		return new Date(t);
	}
}

package com.lgq.tools;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeTest tt = new TimeTest();
	}

	
	public TimeTest()
	{
		Date date = new Date();
		//System.out.println(date.g);
		//date.setHours(date.getHours() - 1);
		Timestamp timeStamp1 = new Timestamp(date.getTime() - 1000 * 60 * 60 * 11);
		Timestamp timeStamp2 = new Timestamp(date.getTime());
		
		System.out.println("-----"+timeStamp2);
		System.out.println("-----"+timeStamp1);

		long seconds = (timeStamp1.getTime() - timeStamp2.getTime()) / 1000;
		System.out.println(seconds);
		System.out.println(getDaysBetween(timeStamp1, timeStamp2));
		int diffday = getDaysBetween(timeStamp1, timeStamp2);
		if(diffday != 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
	private int getDaysBetween (Timestamp start, Timestamp end)   {

	      boolean negative = false;
	      if (end.before(start))  {
	          negative = true;
	          Timestamp temp = start;
	          start = end;
	          end = temp;
	      }

	      GregorianCalendar cal = new GregorianCalendar();
	      cal.setTime(start);
	      cal.set(Calendar.HOUR_OF_DAY, 0);
	      cal.set(Calendar.MINUTE, 0);
	      cal.set(Calendar.SECOND, 0);
	      cal.set(Calendar.MILLISECOND, 0);

	      GregorianCalendar calEnd = new GregorianCalendar();
	      calEnd.setTime(end);
	      calEnd.set(Calendar.HOUR_OF_DAY, 0);
	      calEnd.set(Calendar.MINUTE, 0);
	      calEnd.set(Calendar.SECOND, 0);
	      calEnd.set(Calendar.MILLISECOND, 0);


	      if (cal.get(Calendar.YEAR) == calEnd.get(Calendar.YEAR))   {
	          if (negative)
	               return (calEnd.get(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR)) * -1;
	          return calEnd.get(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);
	      }

	      int days = 0;
	      while (calEnd.after(cal))    {
	          cal.add (Calendar.DAY_OF_YEAR, 1);
	          days++;
	      }
	      if (negative)
	          return days * -1;
	      return days;
	  }
}

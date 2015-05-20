package com.lgq.tools;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateOffSet {

	private Timestamp dstart;
	private Timestamp dend;
	private int diffday;
	
	public DateOffSet(Timestamp start, Timestamp end) {
		// TODO Auto-generated constructor stub
		dstart = start;
		dend = end;
		diffday = getDaysBetween(dstart, dend);
	}

	
	public Timestamp getDstart() {
		return dstart;
	}


	public void setDstart(Timestamp dstart) {
		this.dstart = dstart;
	}


	public Timestamp getDend() {
		return dend;
	}


	public void setDend(Timestamp dend) {
		this.dend = dend;
	}


	public int getDiffday() {
		return diffday;
	}


	public void setDiffday(int diffday) {
		this.diffday = diffday;
	}


	private int getDaysBetween(Timestamp start, Timestamp end) {

		boolean negative = false;
		if (end.before(start)) {
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

		if (cal.get(Calendar.YEAR) == calEnd.get(Calendar.YEAR)) {
			if (negative)
				return (calEnd.get(Calendar.DAY_OF_YEAR) - cal
						.get(Calendar.DAY_OF_YEAR)) * -1;
			return calEnd.get(Calendar.DAY_OF_YEAR)
					- cal.get(Calendar.DAY_OF_YEAR);
		}

		int days = 0;
		while (calEnd.after(cal)) {
			cal.add(Calendar.DAY_OF_YEAR, 1);
			days++;
		}
		if (negative)
			return days * -1;
		return days;
	}

}

package com.lgq.controller;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;

import com.lgq.entity.TtypefrequencyEntity;
import com.lgq.service.TtypefrequencyManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EdittypefrequencyAction extends ActionSupport implements
		Preparable {
	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger
			.getLogger(EdittypefrequencyAction.class);
	private List<TtypefrequencyEntity> ttypefrequencies;
	private TtypefrequencyEntity ttypefrequency;
	private TtypefrequencyManager ttypefrequencyManager;

	public String listtypesFrequency() {
		logger.info("listtypefrequencies method called");
		ttypefrequencies = ttypefrequencyManager.getAllTypesFrequency();
		return SUCCESS;
	}

	public String addtypeFrequency() {
		logger.info("addtypefrequency method called");
		ttypefrequencyManager.addTypeFrequency(ttypefrequency);
		return SUCCESS;
	}

	public String deletetypeFrequency() {
		logger.info("deletetypefrequency method called");
		ttypefrequencyManager.deleteTypeFrequency(ttypefrequency.getId());
		return SUCCESS;
	}

	// statistics for visiting times
	public String updatetypeFrequency() {
		logger.info("updatetypefrequency method called");
		ttypefrequencyManager.UpdateTypeFrequency(ttypefrequency.getId());
		return SUCCESS;
	}

	public String updatevisiStatistics() {
		logger.info("updatevisiStatistics method called");
		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		ttypefrequencies = ttypefrequencyManager.getAllTypesFrequency();
		
		for (int index = 0; index < ttypefrequencies.size(); index++) {
			if (ttypefrequencies.get(index).getTypeid() == ttypefrequency
					.getTypeid()
					&& ttypefrequencies.get(index).getStatus() == 1) {
				Timestamp historytime = ttypefrequencies.get(index)
						.getVisitdate();
				int diffdays = getDaysBetween(timeStamp, historytime);
				System.out.println("---updatevisiStatistics--"+timeStamp+" - "+historytime+" = "+diffdays);
				if (diffdays != 0) {
					ttypefrequencyManager.UpdateStatus(ttypefrequencies.get(index).getId());
					ttypefrequency.setStatus(1); //here should be modified, need to set as a default value
					ttypefrequencyManager.addTypeFrequency(ttypefrequency);
					return SUCCESS;
				} else {
					ttypefrequencyManager.UpdateTypeFrequency(ttypefrequency
							.getId());
					return SUCCESS;
				}
			}

		}// end for
		ttypefrequencyManager.addTypeFrequency(ttypefrequency);
		return SUCCESS;
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

	public String getBusinesstype() {
		logger.info("getBusinesstype method called");
		ttypefrequencyManager.getTypeFrequency(ttypefrequency.getId());
		return SUCCESS;
	}

	// This method will be called before any of Action method is invoked;
	// So some pre-processing if required.
	@Override
	public void prepare() throws Exception {
		ttypefrequency = null;
	}

	public List<TtypefrequencyEntity> getTtypefrequencies() {
		return ttypefrequencies;
	}

	public void setTtypefrequencies(List<TtypefrequencyEntity> ttypefrequencies) {
		this.ttypefrequencies = ttypefrequencies;
	}

	public TtypefrequencyEntity getTtypefrequency() {
		return ttypefrequency;
	}

	public void setTtypefrequency(TtypefrequencyEntity ttypefrequency) {
		this.ttypefrequency = ttypefrequency;
	}

	public TtypefrequencyManager getTtypefrequencyManager() {
		return ttypefrequencyManager;
	}

	public void setTtypefrequencyManager(
			TtypefrequencyManager ttypefrequencyManager) {
		this.ttypefrequencyManager = ttypefrequencyManager;
	}

}

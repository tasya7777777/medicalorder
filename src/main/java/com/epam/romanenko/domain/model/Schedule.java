package com.epam.romanenko.domain.model;

import java.util.Date;
import com.epam.romanenko.domain.enums.ScheduleTarget;

public class Schedule {

	private Long id;

	private Long itemId;

	private ScheduleTarget scheduleTarget;

	private Date date;

	private Date workTimeFrom; // only time

	private Date workTimeTo; // only time

	private Date breakTimeFrom; // only time

	private Date breakTimeTo; // only time

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public ScheduleTarget getScheduleTarget() {
		return scheduleTarget;
	}

	public void setScheduleTarget(ScheduleTarget scheduleTarget) {
		this.scheduleTarget = scheduleTarget;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getWorkTimeFrom() {
		return workTimeFrom;
	}

	public void setWorkTimeFrom(Date workTimeFrom) {
		this.workTimeFrom = workTimeFrom;
	}

	public Date getWorkTimeTo() {
		return workTimeTo;
	}

	public void setWorkTimeTo(Date workTimeTo) {
		this.workTimeTo = workTimeTo;
	}

	public Date getBreakTimeFrom() {
		return breakTimeFrom;
	}

	public void setBreakTimeFrom(Date breakTimeFrom) {
		this.breakTimeFrom = breakTimeFrom;
	}

	public Date getBreakTimeTo() {
		return breakTimeTo;
	}

	public void setBreakTimeTo(Date breakTimeTo) {
		this.breakTimeTo = breakTimeTo;
	}

}
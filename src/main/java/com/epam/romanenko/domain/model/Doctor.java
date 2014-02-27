package com.epam.romanenko.domain.model;

import java.util.List;

public class Doctor {

	private Long id;

	private DoctorType doctorType;

	private String firstName;

	private String lastName;

	private Room room;

	private List<Schedule> schedules;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DoctorType getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(DoctorType doctorType) {
		this.doctorType = doctorType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

}
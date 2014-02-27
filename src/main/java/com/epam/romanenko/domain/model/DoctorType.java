package com.epam.romanenko.domain.model;

import java.util.List;

public class DoctorType {

	private Long id;

	private String name;

	private List<Doctor> doctors;

	private Integer defaultDuration;

	private Integer defaultCost;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Integer getDefaultDuration() {
		return defaultDuration;
	}

	public void setDefaultDuration(Integer defaultDuration) {
		this.defaultDuration = defaultDuration;
	}

	public Integer getDefaultCost() {
		return defaultCost;
	}

	public void setDefaultCost(Integer defaultCost) {
		this.defaultCost = defaultCost;
	}

	@Override
	public String toString() {
		return "DoctorType [id=" + id + ", name=" + name + ", doctors="
				+ doctors + ", defaultDuration=" + defaultDuration
				+ ", defaultCost=" + defaultCost + "]";
	}

}
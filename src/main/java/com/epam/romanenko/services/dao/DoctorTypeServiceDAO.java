package com.epam.romanenko.services.dao;

import java.util.List;

import com.epam.romanenko.domain.model.DoctorType;

public interface DoctorTypeServiceDAO {

	List<DoctorType> getAll();

	DoctorType getDoctorTypeById(Long l);

}

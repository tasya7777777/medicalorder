package com.epam.romanenko.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epam.romanenko.domain.model.DoctorType;
import com.epam.romanenko.services.dao.DoctorTypeServiceDAO;

@Service
public class DoctorTypeService {

	@Autowired
	@Qualifier(value = "doctorTypeServiceDAOImpl")
	DoctorTypeServiceDAO doctorTypeServiceDAO;

	public DoctorType getDoctorTypeById(Long id) {
		return doctorTypeServiceDAO.getDoctorTypeById(id);
	}

	public List<DoctorType> getAll() {
		return doctorTypeServiceDAO.getAll();
	}
}

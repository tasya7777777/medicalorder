package com.epam.romanenko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epam.romanenko.domain.model.User;
import com.epam.romanenko.services.dao.UserServiceDAO;

@Service
public class UserService {

	@Autowired
	@Qualifier(value = "userServiceDAOImpl")
	UserServiceDAO userServiceDAO;

	public void insertUser(User user) {
		userServiceDAO.insert(user);
	}

}

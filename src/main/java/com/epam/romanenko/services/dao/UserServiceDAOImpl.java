package com.epam.romanenko.services.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.epam.romanenko.domain.model.User;

@Repository("userServiceDAOImpl")
public class UserServiceDAOImpl implements UserServiceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(User user) {
		String sql = "INSERT INTO users (email, firstname, lastname, telephone, username, password) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(
				sql,
				new Object[] { user.getEmail(), user.getFirstName(),
						user.getLastName(), user.getTelephone(),
						user.getUsername(), user.getPassword() });
	}
}

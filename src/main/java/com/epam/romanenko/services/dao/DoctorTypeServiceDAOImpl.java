package com.epam.romanenko.services.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.epam.romanenko.domain.model.DoctorType;

@Repository("doctorTypeServiceDAOImpl")
public class DoctorTypeServiceDAOImpl implements DoctorTypeServiceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DoctorType getDoctorTypeById(Long id) {
		String sql = "SELECT * FROM doctor_types WHERE id=?";
		DoctorType doctorType = // new DoctorType();
		jdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper
				.newInstance(DoctorType.class), id);
		// jdbcTemplate.query(sql, new Object[] { id }, new RowCallbackHandler()
		// {
		// public void processRow(ResultSet rs) throws SQLException {
		// doctorType.setId(rs.getLong("id"));
		// doctorType.setDefaultCost(rs.getInt("defaultcost"));
		// doctorType.setDefaultDuration(rs.getInt("defaultduration"));
		// doctorType.setName(rs.getString("name"));
		//
		// }
		// });
		return doctorType;

	}

	public void insert(DoctorType doctorType) {
		String sql = "INSERT INTO doctor_types (defaultcost, defaultduration, name) "
				+ "VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, new Object[] { doctorType.getDefaultCost(),
				doctorType.getDefaultDuration(), doctorType.getName() });
	}

	// @Autowired
	// private GenericCrudService crudService;
	//
	// public void createDoctorType(DoctorType doctorType) {
	// if (doctorType != null) {
	// crudService.create(doctorType);
	// }
	// }
	//
	// public void delete(DoctorType doctorType) {
	// if (doctorType != null) {
	// crudService.delete(doctorType);
	// }
	// }
	//
	// public DoctorType find(Long doctorTypeId) {
	// return (doctorTypeId != null ? crudService.find(DoctorType.class,
	// doctorTypeId) : null);
	// }
	//
	// public DoctorType saveOrUpdateExistingDoctorType(DoctorType doctorType) {
	// return (doctorType != null ? crudService.saveOrUpdate(doctorType)
	// : null);
	// }

	public List<DoctorType> getAll() {

		String sql = "SELECT * FROM doctor_types";
		List<DoctorType> doctorTypes = // new ArrayList<DoctorType>();
		jdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper
				.newInstance(DoctorType.class));
		// List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		// for (Map<?, ?> row : rows) {
		// DoctorType doctorType = new DoctorType();
		// doctorType.setId(Long.parseLong(String.valueOf(row.get("id"))));
		// doctorType.setName((String) row.get("name"));
		// doctorType.setDefaultDuration(Integer.parseInt(String.valueOf(row
		// .get("defaultduration"))));
		// doctorType.setDefaultCost(Integer.parseInt(String.valueOf(row
		// .get("defaultcost"))));
		// doctorTypes.add(doctorType);
		// }
		return doctorTypes;

	}

}

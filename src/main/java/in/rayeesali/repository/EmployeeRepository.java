package in.rayeesali.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.rayeesali.modal.Employee;

@Repository
public class EmployeeRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeRepository(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Employee e) {
		String sql = "INSERT into employee values(?,?,?,?)";
		return jdbcTemplate.update(sql, e.getId(), e.getName(), e.getDpt(), e.getSal());

	}

	public int update(Employee e) {
		String sql = "UPDATE employee set name=?, dept=?,sal=? where id=?";
		return jdbcTemplate.update(sql, e.getName(), e.getDpt(), e.getSal(), e.getId());
	}

	public int delete(int id) {
		String sql = "Delete from employee  where id=?";
		return jdbcTemplate.update(sql, id);
	}

	public Employee findById(int id) {

		Employee e = null;
		String sql = "Select * from employee  where id=?";

		try {
			e = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		} catch (DataAccessException ex) {

			System.out.println("Error :" + ex);
		} finally {

			return e;
		}

	}

	public List<Employee> findAll() {
		String sql = "Select * from employee  ";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());

	}

}

package in.rayeesali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rayeesali.modal.Employee;
import in.rayeesali.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {

		this.repo = repo;
	}

	public int save(Employee e) {
		return repo.save(e);
	}

	public int update(Employee e) {
		return repo.update(e);
	}

	public int delete(int id) {
		return repo.delete(id);
	}

	public Employee findById(int id) {
		return repo.findById(id);
	}

	public List<Employee> findAll() {
		return repo.findAll();
	}

}

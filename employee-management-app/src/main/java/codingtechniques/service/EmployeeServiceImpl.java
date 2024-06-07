package codingtechniques.service;

import org.hibernate.FetchNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codingtechniques.model.Employee;
import codingtechniques.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> findEmployees() {
		return employeeRepository.findAll();
	
	}

	@Override
	public Employee getEmployeeId(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new FetchNotFoundException("Employee", id));
		return employee;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

}

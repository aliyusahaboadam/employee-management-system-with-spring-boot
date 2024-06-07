package codingtechniques.service;

import org.springframework.stereotype.Service;

import codingtechniques.model.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	Iterable<Employee> findEmployees();
	Employee getEmployeeId(Long id);
	void deleteEmployee(Long id);

}

package codingtechniques.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import codingtechniques.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

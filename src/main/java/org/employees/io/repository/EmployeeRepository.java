package org.employees.io.repository;

import java.util.List;

import org.employees.io.model.EmployeeDto;

public interface EmployeeRepository {

	List<EmployeeDto> getEmployees(Long employeeId);
}

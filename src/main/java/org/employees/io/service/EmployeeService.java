package org.employees.io.service;

import java.util.List;

public interface EmployeeService {

	List<EmployeeCmd> getEmployees(Long employeeId);
}

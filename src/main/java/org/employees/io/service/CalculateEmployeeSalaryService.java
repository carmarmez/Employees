package org.employees.io.service;

import org.employees.io.model.EmployeeDto;

public interface CalculateEmployeeSalaryService {

	EmployeeCmd calculateSalary(EmployeeDto employeeDto);
}

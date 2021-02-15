package org.employees.io.service;

import org.employees.io.model.EmployeeDto;
import org.employees.io.model.EmployeeMonthlyDto;
import org.springframework.stereotype.Service;

@Service(CalculateEmployeeSalaryMonthlyServiceImpl.NAME_BEAN)
public class CalculateEmployeeSalaryMonthlyServiceImpl implements CalculateEmployeeSalaryService {

	protected static final String NAME_BEAN = "MonthlySalaryEmployee";

	@Override
	public EmployeeCmd calculateSalary(EmployeeDto employeeDto) {
		EmployeeMonthlyDto employeeMonthlyDto = (EmployeeMonthlyDto) employeeDto;

		Double annualSalary = employeeMonthlyDto.getMonthlySalary() * 12;

		return EmployeeCmd.fromModel(employeeMonthlyDto, annualSalary);
	}
}

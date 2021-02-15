package org.employees.io.service;

import org.employees.io.model.EmployeeDto;
import org.employees.io.model.EmployeeHourlyDto;
import org.springframework.stereotype.Service;

@Service(CalculateEmployeeSalaryHourlyServiceImpl.NAME_BEAN)
public class CalculateEmployeeSalaryHourlyServiceImpl implements CalculateEmployeeSalaryService {

	protected static final String NAME_BEAN = "HourlySalaryEmployee";

	@Override
	public EmployeeCmd calculateSalary(EmployeeDto employeeDto) {
		EmployeeHourlyDto employeeHourlyDto = (EmployeeHourlyDto) employeeDto;
		
		Double annualSalary = employeeHourlyDto.getHourlySalary() * 120 * 12;
		
		return EmployeeCmd.fromModel(employeeHourlyDto, annualSalary);
	}
}

package org.employees.io.repository;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;

import static java.util.Objects.*;

import java.util.List;

import org.employees.io.model.EmployeeDto;
import org.employees.io.model.EmployeeHourlyDto;
import org.employees.io.model.EmployeeMonthlyDto;
import org.employees.io.model.RoleDto;
import org.employees.io.model.EmployeeDto.ContractType;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<EmployeeDto> getEmployees(Long employeeId) {
		List<EmployeeDto> listEmployees = new ArrayList<>();
		
		if(nonNull(employeeId)) {
			listEmployees = searchEmployeeById(employeeId);
		} else {
			listEmployees = mockEmployees();
		}
		
		return listEmployees;
	}
	
	private List<EmployeeDto> searchEmployeeById(Long employeeId) {
		return mockEmployees().stream().filter(e -> e.getId().equals(employeeId)).collect(toList());
	}

	private List<EmployeeDto> mockEmployees() {
		return asList(
				EmployeeHourlyDto.builder().id(1L).name("Andrea").contractTypeName(ContractType.HourlySalaryEmployee)
						.role(RoleDto.builder().id(1L).name("Administrator").description(null).build())
						.hourlySalary(10000.0).build(),

				EmployeeMonthlyDto.builder().id(2L).name("Alex").contractTypeName(ContractType.MonthlySalaryEmployee)
						.role(RoleDto.builder().id(2L).name("Contractor").description("Contractor Description").build())
						.monthlySalary(50000.0).build());
	}
}

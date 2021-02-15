package org.employees.io.service;

import static java.util.stream.Collectors.toList;
import java.util.List;

import org.employees.io.model.EmployeeDto;
import org.employees.io.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	private CalculateEmployeeSalaryFactory calculateEmployeeSalaryFactoryBean;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository,
			CalculateEmployeeSalaryFactory calculateEmployeeSalaryFactoryBean) {
		this.employeeRepository = employeeRepository;
		this.calculateEmployeeSalaryFactoryBean = calculateEmployeeSalaryFactoryBean;
	}

	@Override
	public List<EmployeeCmd> getEmployees(Long employeeId) {
		List<EmployeeDto> listEmployees = employeeRepository.getEmployees(employeeId);

		return listEmployees.stream()
				.map(e -> calculateEmployeeSalaryFactoryBean.getCalculateEmployeeSalaryService(e.getContractTypeName().name()).calculateSalary(e))
				.collect(toList());
	}

}

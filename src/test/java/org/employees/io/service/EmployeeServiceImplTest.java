package org.employees.io.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class EmployeeServiceImplTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testGetEmployees() {
		List<EmployeeCmd> listEmployes = employeeService.getEmployees(null);

		assertThat(listEmployes).isNotEmpty();
		assertThat(listEmployes).hasSize(2);
		assertThat(listEmployes.get(0).getId()).isEqualTo(1);
		assertThat(listEmployes.get(0).getAnnualSalary()).isEqualTo(14400000D);
		assertThat(listEmployes.get(1).getId()).isEqualTo(2);
		assertThat(listEmployes.get(1).getAnnualSalary()).isEqualTo(600000D);
	}

	@Test
	public void testGetEmployeesById() {
		List<EmployeeCmd> listEmployes = employeeService.getEmployees(1L);

		assertThat(listEmployes).isNotEmpty();
		assertThat(listEmployes).hasSize(1);
		assertThat(listEmployes.get(0).getId()).isEqualTo(1);
		assertThat(listEmployes.get(0).getAnnualSalary()).isEqualTo(14400000D);
	}
}

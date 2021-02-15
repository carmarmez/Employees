package org.employees.io.web;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testGetEmployees() throws Exception {
		mvc.perform(get("/api/employees")).andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[*].id", containsInAnyOrder(1, 2)))
				.andExpect(jsonPath("$[*].annualSalary", containsInAnyOrder(14400000D, 600000D)));
	}
	
	@Test
	public void testGetEmployeesById() throws Exception {
		mvc.perform(get("/api/employees?employeeId=2")).andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].id", equalTo(2)))
				.andExpect(jsonPath("$[0].annualSalary", equalTo(600000D)));
	}
}

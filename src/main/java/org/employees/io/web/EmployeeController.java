package org.employees.io.web;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.employees.io.service.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "Employee")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@ApiOperation("Get employees")
	@GetMapping(value = "/employees")
	public ResponseEntity<List<EmployeeResponse>> getEmployees(
			@RequestParam(value = "employeeId", required = false) Long employeeId) {
		return ResponseEntity
				.ok(employeeService.getEmployees(employeeId).stream().map(EmployeeResponse::fromCmd).collect(toList()));
	}
}

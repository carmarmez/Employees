package org.employees.io.model;

public class EmployeeDto {

	private Long id;
	private String name;
	private ContractType contractTypeName;
	private RoleDto role;

	EmployeeDto(Long id, String name, ContractType contractTypeName, RoleDto role) {
		this.id = id;
		this.name = name;
		this.contractTypeName = contractTypeName;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContractType getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(ContractType contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public RoleDto getRole() {
		return role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

	public enum ContractType {
		HourlySalaryEmployee, MonthlySalaryEmployee
	}
}

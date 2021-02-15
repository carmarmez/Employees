package org.employees.io.web;

import org.employees.io.service.EmployeeCmd;

public class EmployeeResponse {

	private Long id;
	private String name;
	private String contractTypeName;
	private Long roleId;
	private String roleName;
	private String roleDescription;
	private Double monthlySalary;
	private Double hourlySalary;
	private Double annualSalary;

	EmployeeResponse(Long id, String name, String contractTypeName, Long roleId, String roleName,
			String roleDescription, Double monthlySalary, Double hourlySalary, Double annualSalary) {
		this.id = id;
		this.name = name;
		this.contractTypeName = contractTypeName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.monthlySalary = monthlySalary;
		this.hourlySalary = hourlySalary;
		this.annualSalary = annualSalary;
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

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(Double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public Double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(Double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public static EmployeeResponse fromCmd(EmployeeCmd employeeCmd) {
		return EmployeeResponse.builder().id(employeeCmd.getId()).name(employeeCmd.getName())
				.contractTypeName(employeeCmd.getContractTypeName()).roleId(employeeCmd.getRoleId())
				.roleName(employeeCmd.getRoleName()).roleDescription(employeeCmd.getRoleDescription())
				.monthlySalary(employeeCmd.getMonthlySalary()).hourlySalary(employeeCmd.getHourlySalary())
				.annualSalary(employeeCmd.getAnnualSalary()).build();
	}

	public static EmployeeResponseBuilder builder() {
		return new EmployeeResponseBuilder();
	}

	public static class EmployeeResponseBuilder {

		private Long id;
		private String name;
		private String contractTypeName;
		private Long roleId;
		private String roleName;
		private String roleDescription;
		private Double monthlySalary;
		private Double hourlySalary;
		private Double annualSalary;

		public EmployeeResponseBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public EmployeeResponseBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeResponseBuilder contractTypeName(String contractTypeName) {
			this.contractTypeName = contractTypeName;
			return this;
		}

		public EmployeeResponseBuilder roleId(Long roleId) {
			this.roleId = roleId;
			return this;
		}

		public EmployeeResponseBuilder roleName(String roleName) {
			this.roleName = roleName;
			return this;
		}

		public EmployeeResponseBuilder roleDescription(String roleDescription) {
			this.roleDescription = roleDescription;
			return this;
		}

		public EmployeeResponseBuilder monthlySalary(Double monthlySalary) {
			this.monthlySalary = monthlySalary;
			return this;
		}

		public EmployeeResponseBuilder hourlySalary(Double hourlySalary) {
			this.hourlySalary = hourlySalary;
			return this;
		}

		public EmployeeResponseBuilder annualSalary(Double annualSalary) {
			this.annualSalary = annualSalary;
			return this;
		}

		public EmployeeResponse build() {
			return new EmployeeResponse(this.id, this.name, this.contractTypeName, this.roleId, this.roleName,
					this.roleDescription, this.monthlySalary, this.hourlySalary, this.annualSalary);
		}
	}
}

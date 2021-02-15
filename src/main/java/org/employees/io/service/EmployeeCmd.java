package org.employees.io.service;

import org.employees.io.model.EmployeeDto;
import org.employees.io.model.EmployeeHourlyDto;
import org.employees.io.model.EmployeeMonthlyDto;

public class EmployeeCmd {

	private Long id;
	private String name;
	private String contractTypeName;
	private Long roleId;
	private String roleName;
	private String roleDescription;
	private Double monthlySalary;
	private Double hourlySalary;
	private Double annualSalary;

	EmployeeCmd(Long id, String name, String contractTypeName, Long roleId, String roleName, String roleDescription,
			Double monthlySalary, Double hourlySalary, Double annualSalary) {
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

	private static EmployeeCmd fromModel(EmployeeDto employeeDto) {
		return EmployeeCmd.builder().id(employeeDto.getId()).name(employeeDto.getName())
				.contractTypeName(employeeDto.getContractTypeName().name()).roleId(employeeDto.getRole().getId())
				.roleName(employeeDto.getRole().getName()).roleDescription(employeeDto.getRole().getDescription())
				.build();
	}

	public static EmployeeCmd fromModel(EmployeeHourlyDto employeeHourlyDto, Double annualSalary) {
		EmployeeCmd employeeCmd = fromModel(employeeHourlyDto);
		employeeCmd.setHourlySalary(employeeHourlyDto.getHourlySalary());
		employeeCmd.setAnnualSalary(annualSalary);

		return employeeCmd;
	}

	public static EmployeeCmd fromModel(EmployeeMonthlyDto employeeHourlyDto, Double annualSalary) {
		EmployeeCmd employeeCmd = fromModel(employeeHourlyDto);
		employeeCmd.setMonthlySalary(employeeHourlyDto.getMonthlySalary());
		employeeCmd.setAnnualSalary(annualSalary);

		return employeeCmd;
	}

	public static EmployeeCmdBuilder builder() {
		return new EmployeeCmdBuilder();
	}

	public static class EmployeeCmdBuilder {

		private Long id;
		private String name;
		private String contractTypeName;
		private Long roleId;
		private String roleName;
		private String roleDescription;
		private Double monthlySalary;
		private Double hourlySalary;
		private Double annualSalary;

		public EmployeeCmdBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public EmployeeCmdBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeCmdBuilder contractTypeName(String contractTypeName) {
			this.contractTypeName = contractTypeName;
			return this;
		}

		public EmployeeCmdBuilder roleId(Long roleId) {
			this.roleId = roleId;
			return this;
		}

		public EmployeeCmdBuilder roleName(String roleName) {
			this.roleName = roleName;
			return this;
		}

		public EmployeeCmdBuilder roleDescription(String roleDescription) {
			this.roleDescription = roleDescription;
			return this;
		}

		public EmployeeCmdBuilder monthlySalary(Double monthlySalary) {
			this.monthlySalary = monthlySalary;
			return this;
		}

		public EmployeeCmdBuilder hourlySalary(Double hourlySalary) {
			this.hourlySalary = hourlySalary;
			return this;
		}

		public EmployeeCmdBuilder annualSalary(Double annualSalary) {
			this.annualSalary = annualSalary;
			return this;
		}

		public EmployeeCmd build() {
			return new EmployeeCmd(this.id, this.name, this.contractTypeName, this.roleId, this.roleName,
					this.roleDescription, this.monthlySalary, this.hourlySalary, this.annualSalary);
		}
	}
}

package org.employees.io.model;

public class EmployeeMonthlyDto extends EmployeeDto {

	private Double monthlySalary;

	EmployeeMonthlyDto(Long id, String name, ContractType contractTypeName, RoleDto role, Double monthlySalary) {
		super(id, name, contractTypeName, role);
		this.monthlySalary = monthlySalary;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public static EmpoloyeeMonthlyDtoBuilder builder() {
		return new EmpoloyeeMonthlyDtoBuilder();
	}

	public static class EmpoloyeeMonthlyDtoBuilder {

		private Long id;
		private String name;
		private ContractType contractTypeName;
		private RoleDto role;
		private Double monthlySalary;

		public EmpoloyeeMonthlyDtoBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public EmpoloyeeMonthlyDtoBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmpoloyeeMonthlyDtoBuilder contractTypeName(ContractType contractTypeName) {
			this.contractTypeName = contractTypeName;
			return this;
		}
		
		public EmpoloyeeMonthlyDtoBuilder role(RoleDto role) {
			this.role = role;
			return this;
		}
		
		public EmpoloyeeMonthlyDtoBuilder monthlySalary(Double monthlySalary) {
			this.monthlySalary = monthlySalary;
			return this;
		}

		public EmployeeMonthlyDto build() {
			return new EmployeeMonthlyDto(this.id, this.name, this.contractTypeName, this.role, this.monthlySalary);
		}
	}
}

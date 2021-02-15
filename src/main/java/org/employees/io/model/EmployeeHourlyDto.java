package org.employees.io.model;

public class EmployeeHourlyDto extends EmployeeDto {

	private Double hourlySalary;

	EmployeeHourlyDto(Long id, String name, ContractType contractTypeName, RoleDto role, Double hourlySalary) {
		super(id, name, contractTypeName, role);
		this.hourlySalary = hourlySalary;
	}

	public Double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(Double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	public static EmployeeHourlyDtoBuilder builder() {
		return new EmployeeHourlyDtoBuilder();
	}

	public static class EmployeeHourlyDtoBuilder {

		private Long id;
		private String name;
		private ContractType contractTypeName;
		private RoleDto role;
		private Double hourlySalary;

		public EmployeeHourlyDtoBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public EmployeeHourlyDtoBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeHourlyDtoBuilder contractTypeName(ContractType contractTypeName) {
			this.contractTypeName = contractTypeName;
			return this;
		}
		
		public EmployeeHourlyDtoBuilder role(RoleDto role) {
			this.role = role;
			return this;
		}
		
		public EmployeeHourlyDtoBuilder hourlySalary(Double hourlySalary) {
			this.hourlySalary = hourlySalary;
			return this;
		}

		public EmployeeHourlyDto build() {
			return new EmployeeHourlyDto(this.id, this.name, this.contractTypeName, this.role, this.hourlySalary);
		}
	}
}

package org.employees.io.model;

public class RoleDto {

	private Long id;
	private String name;
	private String description;

	RoleDto(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static RoleDtoBuilder builder() {
		return new RoleDtoBuilder();
	}

	public static class RoleDtoBuilder {

		private Long id;
		private String name;
		private String description;

		public RoleDtoBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public RoleDtoBuilder name(String name) {
			this.name = name;
			return this;
		}

		public RoleDtoBuilder description(String description) {
			this.description = description;
			return this;
		}

		public RoleDto build() {
			return new RoleDto(this.id, this.name, this.description);
		}
	}
}

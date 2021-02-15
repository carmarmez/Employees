package org.employees.io.service;

public interface CalculateEmployeeSalaryFactory {

	CalculateEmployeeSalaryService getCalculateEmployeeSalaryService(String contractTypeName);
}

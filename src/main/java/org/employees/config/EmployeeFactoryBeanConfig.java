package org.employees.config;

import org.employees.io.service.CalculateEmployeeSalaryFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeFactoryBeanConfig {

	@Bean
	public FactoryBean calculateEmployeeSalaryFactoryBean() {
		ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(CalculateEmployeeSalaryFactory.class);
		return factoryBean;
	}
}

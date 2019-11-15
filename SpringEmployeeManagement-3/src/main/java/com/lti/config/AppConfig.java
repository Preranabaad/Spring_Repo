package com.lti.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.lti.model.Employee;

@Configuration
@ComponentScan(basePackages={"com.lti"})
public class AppConfig {
	
	@Bean(name="employee")
	public Employee getEmployee(){
		Employee emp= new Employee();
		return emp;
	}
	
	@Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
}	
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}

}

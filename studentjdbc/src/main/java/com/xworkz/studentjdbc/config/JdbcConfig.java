package com.xworkz.studentjdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.xworkz.studentjdbc.dto.StudentDto;
import com.xworkz.studentjdbc.repository.StudentRepository;
import com.xworkz.studentjdbc.repository.StudentRepositoryImpl;
@Configuration
@ComponentScan(basePackages = "com.xworkz.studentjdbc.repository")
public class JdbcConfig {
@Bean("ds")
public DataSource getDataSource() {
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	dataSource.setUsername("root");
	dataSource.setPassword("Xworkzodc@123");
	return dataSource;
}

@Bean("jdbcTemplate")
public JdbcTemplate getJdbcTemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
}


}

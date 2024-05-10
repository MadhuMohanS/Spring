package com.xworkz.companyjdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import  org.springframework.jdbc.core.*;

import com.xworkz.companyjdbc.companydto.Company;

public class RowMapperImpl implements RowMapper<Company>{

	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Company company=new Company();
		company.setId(rs.getInt(1));
		company.setCity(rs.getString(3));
		company.setName(rs.getString(2));
		return company;
	}

}

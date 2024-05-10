package com.xworkz.companyjdbc.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.companyjdbc.companydto.Company;

public class CompanyRepositoryImpl implements CompanyRepository{

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(Company company) {
		// TODO Auto-generated method stub
		String query="insert into company values(?,?,?)";
		int update = jdbcTemplate.update(query,company.getId(),company.getName(),company.getCity());
		System.out.println(update+" no of rows inserted");
		return update;
	}
	public int update(Company company) {
		// TODO Auto-generated method stub
		String query="update company set name=?,city=? where id=?";
		int update = jdbcTemplate.update(query,company.getName(),company.getCity(),company.getId());
		System.out.println("data updateed successfully");
		return update;
	}
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		String query="delete from company where id=?";
		int update = jdbcTemplate.update(query,id);
		System.out.println("data successfully deleted");
		return update;
	}
	public int saveAll(List<Company> companies) {
		// TODO Auto-generated method stub
		String query="insert into company values(?,?,?)";
		 jdbcTemplate.batchUpdate(query,new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Company company
				=companies.get(i);
				ps.setInt(1,company.getId() );
				ps.setString(2, company.getName());
				ps.setString(3, company.getCity());
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return companies.size();
			}
		});
		return companies.size();
	}
	public Company find(int id) {
		// TODO Auto-generated method stub
		String query="select * from company where id=?";
		RowMapperImpl rowMapper=new RowMapperImpl();
		Company queryForObject = jdbcTemplate.queryForObject(query, rowMapper,id);
		
		return queryForObject;
	}
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		String query="select * from company";
		RowMapperImpl rowMapper=new RowMapperImpl();
		List<Company> list = jdbcTemplate.query(query,rowMapper);
		System.out.println("data successfully inserted");
		return list;
	}

}

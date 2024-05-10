package com.xworkz.companyjdbc.repository;

import java.util.List;

import com.xworkz.companyjdbc.companydto.Company;

public interface CompanyRepository {
public int save(Company company);
public int update(Company company);
public int delete(Integer id);
public int saveAll(List<Company> companies);
public Company find(int id);
public List<Company> findAll();
}

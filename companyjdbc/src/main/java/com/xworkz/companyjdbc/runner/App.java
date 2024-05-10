package com.xworkz.companyjdbc.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.companyjdbc.companydto.Company;
import com.xworkz.companyjdbc.repository.CompanyRepository;
import com.xworkz.companyjdbc.repository.CompanyRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/xworkz/companyjdbc/config.xml");
       CompanyRepository companyRepository=context.getBean("company",CompanyRepositoryImpl.class);
       Company company=new Company();
       company.setId(2);
       company.setName("Infosys");
       company.setCity("Banglore");
       
       List<Company> list=new ArrayList<Company>();
       Company company2=new Company();
       company2.setId(3);
       company2.setName("wipro");
       company2.setCity("banglore");
       
       Company company3=new Company();
       company3.setId(4);
       company3.setName("tcs");
       company3.setCity("banglore");
       
       list.add(company2);
       list.add(company3);
//       int save = companyRepository.save(company);
//       System.out.println("data successfuly inserted "+save);
       
//       companyRepository.update(company);
       companyRepository.delete(0);
//       Company find = companyRepository.find(1);
//       System.out.println(find);
//       int saveAll = companyRepository.saveAll(list);
//       System.out.println(saveAll +" rows inserted");
       
       List<Company> findAll = companyRepository.findAll();
       findAll.forEach(x->System.out.println(x));
       
    }
}

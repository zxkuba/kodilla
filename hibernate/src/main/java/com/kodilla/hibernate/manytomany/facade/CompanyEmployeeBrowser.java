package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQuery;


@NamedNativeQuery(
        name = "Company.retrieveCompanyBySubString",
        query = "SELECT * FROM COMPANIES WHERE substring(COMPANY_NAME,1,3) = :COMPANYNAME",
        resultClass = Company.class
)

@Service
public class CompanyEmployeeBrowser {

    @Autowired
    private Company company;

    @Autowired
    private Employee employee;


}

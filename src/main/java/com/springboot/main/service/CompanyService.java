package com.springboot.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.exception.InvalidIdException;
import com.springboot.main.model.Company;
import com.springboot.main.repository.CompanyRepository;

@Service
public class CompanyService {
 @Autowired
 CompanyRepository companyRepository;
 
 public Company insert(Company company) {
		return companyRepository.save(company);
	}
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public Company getCompanyById(int cid) throws InvalidIdException {
		Optional<Company> optional=companyRepository.findById(cid);
		if(!optional.isPresent())
			throw new InvalidIdException("companyid Invalid");
		return optional.get();
	}
}